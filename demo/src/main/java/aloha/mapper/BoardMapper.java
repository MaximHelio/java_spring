package aloha.mapper;

import aloha.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
//    BoardMapper.xml 을 연결해줌. id가 똑같아야 함

    // 게시글 목록
    public List<Board> list() throws Exception;
    // throws Exception : 예외 떠넘기기
    // => DB에 접근해봤더니, 안됐을 때, 그 예외에 대한 결과를 이 메서드에서 처리하는게 아니라 이 메서드를 호출하는 곳에서 처리하도록 함

    // 게시글 쓰기
    public int insert(Board board) throws Exception;

    // 게시글 읽기
    public Board read(int boardNo) throws Exception;

    // 게시글 수정
    public int update(Board board) throws Exception;

    // 게시글 삭제
    public int delete(int boardNo) throws Exception;

    // 게시글 검색
    public List<Board> search(Option option) throws Exception;

    // 게시글 페이징
    public List<Board> page(Page page) throws Exception;

    // 전체 게시글 수
    public int count() throws Exception;    // id=count인 sql을 가져옴

    // 게시글 목록 - 검색/페이징
    public List<Board> boardList(@Param("boardDTO") BoardDTO boardDTO) throws Exception;

    // 검색어를 포함하는 게시글 수
    public int countWithKeyword(Option option) throws Exception;

    // 파일 업로드
    public int uploadFile(Files uploadFile);
}
