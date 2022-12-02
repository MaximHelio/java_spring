package aloha.mapper;

import aloha.domain.Board;
import aloha.domain.Option;
import org.apache.ibatis.annotations.Mapper;

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
}
