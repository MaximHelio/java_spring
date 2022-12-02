package aloha.domain;

import lombok.Data;

@Data
public class Option {

    String keyword;
    // 1: 제목
    // 2: 내용
    // 3: 제목+ 내용
    // 4. 작성자
    int optionCode;

    public Option(){
        this.keyword = "";
    }
}
