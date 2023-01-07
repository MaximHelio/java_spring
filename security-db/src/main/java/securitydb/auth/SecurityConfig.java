package java.securitydb.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration          // 해당 클래스를 스프링 설정하는 빈으로 등록
@EnableWebSecurity      // 해당 클래스를 시큐리티 설정 클래스로 지정. 스프링 시큐리티 기능을 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests()
                .antMatchers("/").permitAll()                                 // 루트(/) 경로 요청에 대해 모두에게 허용
                .antMatchers("/css/**", "/js/**", "/img/**").permitAll()      // 정적 자원은 모두에게 허용
                .antMatchers("/member/**").hasAnyRole("USER", "ADMIN")  // member 아래 요청에 대해 'ROLE_USER', 'ROLE_ADMIN' 권한에 허용
                .antMatchers("/admin/**").hasRole("ADMIN")                    // /admin 아래 요청에 대해 'ROLE_ADMIN' 권한에게 허용
                .anyRequest().authenticated();                                          // 그 외 다른 요청들은 허가된 경우에만 사용할 수 있도록

        // 폼 로그인 설정
        http.formLogin()
            .loginPage("/auth/login")           //로그인 페이지 URL 지정(default: /login)
            .loginProcessingUrl("/auth/login")  // 로그인 처리 URL 지정
            .usernameParameter("id")            // 로그인 폼 요청 ID 파라미터 지정(default: username)
            .passwordParameter("pw")            // 로그인 폼 요청 아이디 파라미터명 지정(default: password)
            .permitAll();                       // 로그인 URL 요청을 모두에게 허용

        // 폼 로그아웃 설정
        http.logout()                           // 로그아웃 URL 요청을 모두에게 허용
            .logoutUrl("/logout")               // 로그아웃 처리 URL 지정 (default: "/logout")
            .permitAll();

        // SSL 비활성화
        http.csrf().disable();                  // 시큐리티가 CSRF 공격에 대한 보호 설정을 기본으로 해줌
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // JDBC 인증을 위해 필요한 정보 (이걸 알려줘야 시큐리티가 접속 가능)
        // - 데이터 소스 (DB 정보 : 호스트URL, 접속에 필요한 id/pw)
        // - ID/PW 인식할 수 있는 쿼리
        // - 권한을 가져올 쿼리를 인식
        // - 패스워드에 대한 암호화 방식
        auth.jdbcAuthentication(); // 인메모리 방식 대신 jdbc(DB)통한 인증 수행

    }
}
