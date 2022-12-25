package aloha.mapper;

import aloha.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FileMapper {

    // 파일 업로드
    public int uploadFile(Files uploadFile);

    // 파일 목록
    public List<Files> fileList(Files files) throws Exception;

    // 파일 조회
    public Files read(int fileNo) throws Exception;

    // 파일 삭제
    public int delete(int fileNo) throws Exception;

    // 파일 선택 목록 삭제
    public int deleteSelectList(String fileNoList) throws Exception;

    // 파일 선택 목록 조회
    public List<Files> fileSelectList(String fileNoList) throws Exception;
}
