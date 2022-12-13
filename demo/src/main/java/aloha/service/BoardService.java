package aloha.service;

import aloha.domain.*;

import java.util.List;

public interface BoardService {
//    BoardServiceImpl에서 구현해서 비즈니스 로직을 작성하는 부분

    // 게시글 목록
    public List<Board> list() throws Exception;
    public List<Board> list(Option option) throws Exception; // option을 넘길 때에는 검색옵션을 같이
    public BoardDTO list(Page page) throws Exception; // page를 같이 넘길 때에는 paging을
    public BoardDTO list(BoardDTO boardDTO) throws Exception;
    // 게시글 쓰기
    public int insert(Board board) throws Exception;

    // 게시글 읽기
    public Board read(int boardNo) throws Exception;

    // 게시글 수정
    public int update(Board board) throws Exception;

    // 게시글 삭제
    public int delete(int boardNo) throws Exception;

    // 전체 게시글 수
    public int count() throws Exception;

    // 파일 목록
    public List<Files> fileList(Files files) throws Exception;

}
