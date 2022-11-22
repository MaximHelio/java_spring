package aloha.mapper;

import aloha.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 목록
    public List<Board> list() throws Exception; // throws Exception : 예외 떠넘기기 => DB에 접근해봤더니, 안됐을 때, 그 예외에 대한 결과를 이 메서드에서 처리하는게 아니라 이 메서드를 호출하는 곳에서 처리하도록 함
}
