package aloha.controller;

import aloha.domain.Board;
import aloha.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
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
    public String insertPro(Model model, Board board) throws Exception {

        log.info("게시글 쓰기 처리...");
        log.info("Board: " + board);

        int result = service.insert(board); // 날라오는 글 행의개수

        if( result > 0){
            log.info("글쓰기 처리 성공");
        }

        model.addAttribute("msg", "등록이 완료되었습니다");

        return "board/success";
    }

    // 게시글 읽기 - 화면
    @GetMapping("/board/read")
    public String read(Model model, @RequestParam("boardNo") int boardNo) throws Exception {

        Board board = service.read(boardNo);
        model.addAttribute("board", board);

        return "board/read";
    }
    // 게시글 수정 - 화면
    @GetMapping("/board/update")
    public String update(Model model, int boardNo) throws Exception {

        Board board = service.read(boardNo);
        model.addAttribute("board", board);

        return "board/update";
    }
    // 게시글 수정 - 처리
    @PostMapping("/board/update")
    public String updatePro(Model model, Board board) throws Exception {
        int result = service.update(board);

        if(result > 0){
            log.info("게시글 수정 성공...");
        }
        model.addAttribute("msg", "수정이 완료되었습니다");

        return "board/success";
    }

    // 게시글 삭제 - 처리
    @PostMapping("/board/delete")
    public String delete(Model model, int boardNo) throws Exception {
        int result = service.delete(boardNo);

        if(result > 0){
            log.info("게시글 삭제 성공...");
        }
        model.addAttribute("msg", "삭제가 완료되었습니다");

        return "board/success";
    }
}
