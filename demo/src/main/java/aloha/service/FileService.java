package aloha.service;

import aloha.domain.Files;

import java.util.List;

public interface FileService {

    // 파일 업로드
    public int uploadFile(Files uploadFile);

    // 파일 목록
    public List<Files> fileList(Files files) throws Exception;

    // 파일 조회
    public Files read(int fileNo) throws Exception;

    // 파일 삭제
    public int delete(int fileNo ) throws Exception;

    // 파일 선택 목록 삭제
    public String deleteSelectList(String fileNoList) throws Exception;

    // 파일 선택 목록 조회
    public List<Files> fileSelectList(String fileNoList) throws Exception;
}
