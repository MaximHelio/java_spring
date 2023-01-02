package aloha.service;

import aloha.domain.Files;
import aloha.mapper.FileMapper;
import aloha.mapper.FileMapper;
import aloha.utils.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.StringTokenizer;

@Slf4j
@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private FileUtils fileUtils;

    @Override
    public int uploadFile(Files uploadFile) {
        return fileMapper.uploadFile(uploadFile);
    }
    @Override
    public List<Files> fileList(Files files) throws Exception {
        return fileMapper.fileList(files);
    }

    @Override
    public Files read(int fileNo) throws Exception {
        return fileMapper.read(fileNo);
    }

    @Override
    public int delete(int fileNo) throws Exception {

        // 실제 파일 삭제
        boolean result = deleteFile(fileNo);

        // DB 파일 데이터 삭제
        if(result){
            return fileMapper.delete(fileNo);
        }
        return 0;
    }

    @Override
    public String deleteSelectList(String fileNoList) throws Exception {

        // 파일 목록 조회
        List<Files> fileList = fileMapper.fileSelectList(fileNoList);

        log.info("fileList: " + fileList);

        int deleteCount = 0;
        String deleteFileNoList = "";

        // 파일 시스템의 파일 항목 삭제
        for (int i=0; i<fileList.size(); i++) {
            Files file = fileList.get(i);
            String filePath = file.getFilePath();
            int fileNo = file.getFileNo();
            boolean deleteYn = fileUtils.deleteFile(filePath);

            if( deleteYn ){
                // DB의 파일 데이터를 삭제, 삭제된 행의 개수 누적해줌
                deleteCount += fileMapper.delete( fileNo );
                deleteFileNoList += fileNo;
                // 1, 2, 3
                if( i+1 < fileList.size() ){
                    deleteFileNoList += ",";
                }
            }
        }
        log.info(deleteCount + " 개의 파일이 삭제되었습니다.");
        return deleteFileNoList;
    }

    @Override
    public List<Files> fileSelectList(String fileNoList) throws Exception {
        return fileMapper.fileSelectList(fileNoList);
    }

    // 파일 삭제 오버로딩
    public boolean deleteFile(int fileNo) throws Exception{
        String filePath = fileMapper.read(fileNo).getFilePath();
        return fileUtils.deleteFile(filePath);
    }
}
