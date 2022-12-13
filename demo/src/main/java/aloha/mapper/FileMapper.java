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
}
