package aloha.controller;

import aloha.domain.Board;
import aloha.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService service;

    // 게시글 목록
    @RequestMapping(value = "/board/list", method= RequestMethod.GET)
    @GetMapping("/board/list")
    public String list(Model model) throws Exception{
        List<Board> list = service.list();

        // 모델에 데이터 등록
        model.addAttribute("list", list);

        // thymeleaf 엔진을 쓰면 응답할 VIEW 파일을 지정해줄 수 있음
        return "board/list";
    }

    // 게시글 쓰기 - 화면
    @GetMapping("/board/insert")
    public String insert(){

        return "board/insert";
    }

    // 게시글 쓰기 - 처리
    @PostMapping("/board/insert")
    public String insertPro(){

        return "board/success";
    }

    // 게시글 읽기 - 화면
    @GetMapping("/board/read")
    public String read(){

        return "board/read";
    }
    // 게시글 수정 - 화면
    @GetMapping("/board/update")
    public String update(){

        return "board/update";
    }
    // 게시글 수정 - 처리
    @PostMapping("/board/update")
    public String updatePro(){

        return "board/success";
    }

    // 게시글 삭제 - 처리
    @PostMapping("/board/delete")
    public String delete(){

        return "board/success";
    }
}
