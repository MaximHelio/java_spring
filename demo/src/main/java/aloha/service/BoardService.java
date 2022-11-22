package aloha.service;

import aloha.domain.Board;

import java.util.List;

public interface BoardService {

    // 게시글 목록
    public List<Board> list() throws Exception;



}
