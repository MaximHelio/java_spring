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
}
