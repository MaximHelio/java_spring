package aloha.service;

import aloha.domain.Board;
import aloha.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}