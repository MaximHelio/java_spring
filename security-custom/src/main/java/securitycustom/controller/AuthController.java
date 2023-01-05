package securitycustom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class AuthController {

    @GetMapping("/admin")
    public String admin(){
        return "/admin/index";
    }
    @GetMapping("/member")
    public String member(){
        return "/member/index";
    }

    @GetMapping("/auth/login")
    public String login(){
        return "/auth/login";
    }
}
