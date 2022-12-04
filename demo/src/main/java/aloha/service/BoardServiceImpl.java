package aloha.service;

import aloha.domain.Board;
import aloha.domain.BoardDTO;
import aloha.domain.Option;
import aloha.domain.Page;
import aloha.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

    // 의존성 주입 (BoardServiceImpl이라는 클래스가 mapper라는 인터페이스에 의존. => mapper 뒤에 객체를 만든 것 까지가 의존성 주입이라는 과정임
    // 인터페이스 자체로는 객체를 생성할 수 없음.-> 인터페이스를 구현해놓은 클래스를 호출)
    // => 의존성에 대한 제어의 권한을 개발자가 쥐고있었는데, 그걸 프레임워크(IoC Container)에 넘김
    // => 제어의 역전 => mapper 뒤에 객체를 선언하지 않아도 됨
    @Autowired
    private BoardMapper mapper;

    @Override
    public List<Board> list() throws Exception {
        return mapper.list(); // throws Exception이니 또 떠넘김
    }

    @Override
    public List<Board> list(Option option) throws Exception {
        return mapper.search(option);
    }

    @Override
    public BoardDTO list(Page page) throws Exception {

        int totalCount = mapper.count();
        log.info("total: "+ totalCount);
        int pageNum = page.getPageNum();
        int rowsPerPage = page.getRowsPerPage();
        int pageCount = page.getPageCount();

        page = new Page(pageNum, rowsPerPage, pageCount, totalCount);
//        page = new Page(pageNum, rowsPerPage, pageCount, totalCount);

        page.setTotalCount(totalCount);

        List<Board> boardList = mapper.page(page);
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardList(boardList);
        boardDTO.setPage(page);

        return boardDTO;
    }

    @Override
    public int insert(Board board) throws Exception {

        return mapper.insert(board);
    }

    @Override
    public Board read(int boardNo) throws Exception {
        return mapper.read(boardNo);
    }

    @Override
    public int update(Board board) throws Exception {
        return mapper.update(board);
    }

    @Override
    public int delete(int boardNo) throws Exception {
        return mapper.delete(boardNo);
    }

    @Override
    public int count() throws Exception {
        return mapper.count();
    }
}
