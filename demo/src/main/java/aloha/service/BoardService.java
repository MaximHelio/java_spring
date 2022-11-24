package aloha.service;

import aloha.domain.Board;

import java.util.List;

public interface BoardService {
//    BoardServiceImpl에서 구현해서 비즈니스 로직을 작성하는 부분

    // 게시글 목록
    public List<Board> list() throws Exception;

    // 게시글 쓰기
    public int insert(Board board) throws Exception;

    // 게시글 읽기
    public Board read(int boardNo) throws Exception;

    // 게시글 수정
    public int update(Board board) throws Exception;

    // 게시글 삭제
    public int delete(int boardNo) throws Exception;
}
