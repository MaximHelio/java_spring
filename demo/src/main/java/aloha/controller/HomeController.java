package aloha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller         // 해당 클래스를 컨트롤러로 지정
public class HomeController {

    // 요청 경로 매핑
    // HTTP Method: GET, POST, PUT, DELETE
    @GetMapping({ "/", "" })
    public String home(Model model) throws Exception{

        model.addAttribute("welcome", "안녕하세요");

        return "index";
    }

}
