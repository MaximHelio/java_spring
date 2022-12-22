package aloha.controller;

import aloha.domain.Files;
import aloha.service.FileService;
import lombok.extern.slf4j.Slf4j;
//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.IOUtils;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
        sos = response.getOutputStream(); // 출력으로 outputstream 가져옴

        FileCopyUtils.copy(fis, sos);

//        byte b[] = new byte[1024];
//        int data = 0;
        // fis.read() : 파일 데이터를 읽어오는 메소드
        // 더이상 읽어올 데이터가 없으면 -1 반환
//        while( (data=(fis.read(b, 0, b.length))) != -1){
//            // sos.write() : 서버에서 클라이언트로 데이터를 출력하는 메소드
//            sos.write(b, 0, data);
//        } => FileCopyUtils.copy(fis, cos)로 대체
//        sos.flush(); // FileCopyUtils안에 있음

    }
    // 압축 다운로드
    @GetMapping("/zipDownload/{parent}/{parentNo}")
    public void zipDownload(HttpServletRequest request, HttpServletResponse response
                            , @PathVariable("parent") String parent, @PathVariable("parentNo") int parentNo
                            , @RequestParam Map<String, String> paramMap) throws Exception {

        // /zipDownload/board/10?title=게시판제목&boardNo=10&xxx=123&xxxx=1000
        String title = paramMap.get("title");

        // 부모 테이블, 부모 번호로 파일 리스트 조회
        Files files = new Files();
        files.setParentTable(parent);
        files.setParentNo(parentNo);
        List<Files> filesList = fileService.fileList(files);

        // 파일목록을 추가해서 압축파일 생성
        String zipFile = "temp.zip";
        String downloadFileName = title;

        String browser = request.getHeader("User-Agent");
        //파일 인코딩
        if(browser.contains("MSIE") || browser.contains("Trident") || browser.contains("Chrome")){
            //브라우저 확인 파일명 encode
            downloadFileName = URLEncoder.encode(downloadFileName,"UTF-8").replaceAll("\\+", "%20");
        }else{
            downloadFileName = new String(downloadFileName.getBytes("UTF-8"), "ISO-8859-1");
        }

        try{
            FileOutputStream fout = new FileOutputStream(zipFile);
            ZipOutputStream zout = new ZipOutputStream(fout);

            for (int i = 0; i < filesList.size(); i++) {
                // 압축파일 항목 생성
                String fileName = filesList.get(i).getFileName();
                // 항목 파일
//                File entryFile = new File(fileName);
                ZipEntry zipEntry = new ZipEntry(fileName);
                zout.putNextEntry(zipEntry);

                // 바이트 넣기
                String filePath = filesList.get(i).getFilePath();
                FileInputStream fin = new FileInputStream(filePath);
                byte[] buffer = new byte[1024];
                int data;

                while( (data = fin.read(buffer)) > 0 ){
                    zout.write(buffer, 0, data);
                }
//                FileCopyUtils.copy(fin, zout);
                zout.closeEntry();
                fin.close();
            }
            zout.close();

            // 압축 파일 --> 클라이언트
            response.setContentType("application/zip");
            response.setHeader("Content-Disposition","attachment; filename=" + downloadFileName+ ".zip");

            // 압축파일 (.zip) 읽어오고,
            // 클라이언트로 전송하고
            FileInputStream fis = new FileInputStream(zipFile);
            ServletOutputStream sos = response.getOutputStream();

            FileCopyUtils.copy(fis, sos);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    // 선택 압축 다운로드
    @GetMapping("/zipDownload/select/{parent}")
    public ResponseEntity<?> selectDownload(HttpServletRequest request, HttpServletResponse response
                                                , int[] fileNoList, String title) throws Exception {
//
//        String[] fileNoList = request.getParameterValues("fileNoList");
        List<Files> fileList = new ArrayList<Files>();
        for (int fileNo: fileNoList) {
            log.info("fileNo: " + fileNo);

            Files file = fileService.read(fileNo);
            fileList.add(file);
        }

        // 파일목록을 추가해서 압축파일 생성
        String zipFile = "temp.zip";
        String downloadFileName = title;

        String browser = request.getHeader("User-Agent");
        //파일 인코딩
        if(browser.contains("MSIE") || browser.contains("Trident") || browser.contains("Chrome")){
            //브라우저 확인 파일명 encode
            downloadFileName = URLEncoder.encode(downloadFileName,"UTF-8").replaceAll("\\+", "%20");
        }else{
            downloadFileName = new String(downloadFileName.getBytes("UTF-8"), "ISO-8859-1");
        }

        try{
            FileOutputStream fout = new FileOutputStream(zipFile);
            ZipOutputStream zout = new ZipOutputStream(fout);

            for (int i = 0; i < fileList.size(); i++) {
                // 압축파일 항목 생성
                String fileName = fileList.get(i).getFileName();
                // 항목 파일
//                File entryFile = new File(fileName);
                ZipEntry zipEntry = new ZipEntry(fileName);
                zout.putNextEntry(zipEntry);

                // 바이트 넣기
                String filePath = fileList.get(i).getFilePath();
                FileInputStream fin = new FileInputStream(filePath);
                byte[] buffer = new byte[1024];
                int data;

                while( (data = fin.read(buffer)) > 0 ){
                    zout.write(buffer, 0, data);
                }
//                FileCopyUtils.copy(fin, zout);
                zout.closeEntry();
                fin.close();
            }
            zout.close();

            // 압축 파일 --> 클라이언트
            // response.setContentType("application/zip");
            // response.setHeader("Content-Disposition","attachment; filename=" + downloadFileName+ ".zip");

            File file = new File( zipFile );

            log.info("file - fileName : "+ file.getName());
            FileItem fileItem = new DiskFileItem("fileName", java.nio.file.Files.probeContentType(file.toPath()), false,
                                                    downloadFileName, (int)file.length(), file.getParentFile());


            FileInputStream fis = new FileInputStream(file);
            OutputStream os = fileItem.getOutputStream();
            IOUtils.copy(fis, os);

            log.info("fileItem - size : " + fileItem.getSize());

            MultipartFile downloadFile = new CommonsMultipartFile( fileItem );

            return ResponseEntity.ok()
                                 .contentType(MediaType.APPLICATION_OCTET_STREAM)
                                 .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""
                                                                                        + downloadFileName + "\"")
                                 .body(downloadFile.getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

}
