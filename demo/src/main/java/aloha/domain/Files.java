package aloha.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
public class Files {

    MultipartFile file;
    private int fileNo;
    private String filePath;
    private String fileName;
    private long fileSize;

    //    외래키
    private String parentTable; // board
    private int parentNo;       // 10
    private String parentPk;
    private LocalDateTime regDate;
}
