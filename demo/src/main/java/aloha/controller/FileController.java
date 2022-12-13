package aloha.controller;

import aloha.domain.Files;
import aloha.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    // file/download/10
    @GetMapping("/download/{fileNo}")
    public void fileDownload(@PathVariable("fileNo") int fileNo,
                            HttpServletRequest request, HttpServletResponse response) throws Exception{

        // 파일 조회
        Files file = fileService.read(fileNo);

        if( file == null ){
            return;
        }

        String filePath = file.getFilePath();
        String fileName = file.getFileName();

        FileInputStream fis = null;
        ServletOutputStream sos = null;

        String browser = request.getHeader("User-Agent");

        //파일 인코딩
        if(browser.contains("MSIE") || browser.contains("Trident") || browser.contains("Chrome")){
            //브라우저 확인 파일명 encode
            fileName = URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+", "%20");
        }else{
            fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
        }

        // 클라이언트에서 서버로 request 요청을 날리고, 서버가 그 요청에 따른 데이터를 가지고 응답. 이 통칭 규약을 http라 부름
        // http 통신 규약에 대해 정리하면 이해됨
        // 응답 헤더를 설정
        response.setHeader("Content-Disposition","attachment;filename=\"" + fileName+"\"");
        response.setContentType("text/html");
        response.setHeader("Content-Transfer-Encoding", "binary;");

        // 실제 C드라이브에 들어가서 가져오는
        File downloadFile = new File(filePath);
        // 자바 응용프로그램, 윈도우 시스템에서 각각 파일을 읽어들어와야 함 , 파일 규칙을 맞춰서 가져오기 위한 입력 통로
        fis = new FileInputStream(downloadFile);
        sos = response.getOutputStream();

        FileCopyUtils.copy(fis, sos);

//        byte b[] = new byte[1024];
//        int data = 0;
        // fis.read() : 파일 데이터를 읽어오는 메소드
        // 더이상 읽어올 데이터가 없으면 -1 반환
//        while( (data=(fis.read(b, 0, b.length))) != -1){
//            // sos.write() : 서버에서 클라이언트로 데이터를 출력하는 메소드
//            sos.write(b, 0, data);
//        } => FileCopyUtils.copy(fis, cos)로 대체

        sos.flush();

    }
}
