package aloha.domain;

import lombok.Data;

import java.util.List;


@Data
public class BoardDTO {
        private Board board;
        private List<Board> boardList;
        private Option option;
        private Page page;

}
