package securitycustom.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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

    @Autowired
    public void configureMemory(AuthenticationManagerBuilder auth) throws Exception{
        // 인메모리 방식으로 인증 처리
        auth.inMemoryAuthentication()
                // ID : user, PW : 123456, 권한 : ROLE_USER 로 메모리에 저장 > 서버가 꺼지면 꺼짐
                .withUser("user").password( "{noop}123456").roles("USER")
                .and()
                // ID : admin, PW : 123456, 권한 : ROLE_ADMIN 으로 메모리에 저장
                .withUser("admin").password( "{noop}123456").roles("ADMIN");
    }
    // 스프링 시큐리티 기본 암호화 방식
//    @Bean // 메서드에서 반환하는 객체를 스프링 컨테이너에 등록해줌 > 스프링 시작시, 해당 인스턴스가 필요한 시점에 컨테이너에서 꺼내옴
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
}
