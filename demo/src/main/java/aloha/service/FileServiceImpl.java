package aloha.service;

import aloha.domain.Files;
import aloha.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileMapper fileMapper;
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
}
