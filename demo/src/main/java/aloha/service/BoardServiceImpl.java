package aloha.service;

import aloha.domain.*;
import aloha.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

    // 업로드 경로
    @Value("${upload.path}")
    private String uploadPath;

    // 의존성 주입 (BoardServiceImpl이라는 클래스가 mapper라는 인터페이스에 의존. => mapper 뒤에 객체를 만든 것 까지가 의존성 주입이라는 과정임
    // 인터페이스 자체로는 객체를 생성할 수 없음.-> 인터페이스를 구현해놓은 클래스를 호출)
    // => 의존성에 대한 제어의 권한을 개발자가 쥐고있었는데, 그걸 프레임워크(IoC Container)에 넘김
    // => 제어의 역전 => mapper 뒤에 객체를 선언하지 않아도 됨
    @Autowired
    private BoardMapper mapper;

    @Override
    public List<Board> list() throws Exception {
        return mapper.list(); // throws Exception이니 또 떠넘김
    }

    @Override
    public List<Board> list(Option option) throws Exception {
        return mapper.search(option);
    }

    @Override
    public BoardDTO list(Page page) throws Exception {

        int totalCount = mapper.count(); // 게시물의 전체 개수

        log.info("total: "+ totalCount);
        int pageNum = page.getPageNum();
        int rowsPerPage = page.getRowsPerPage();
        int pageCount = page.getPageCount();

        page = new Page(pageNum, rowsPerPage, pageCount, totalCount);
//        page = new Page(pageNum, rowsPerPage, pageCount, totalCount);

        page.setTotalCount(totalCount);

        List<Board> boardList = mapper.page(page);
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardList(boardList);
        boardDTO.setPage(page);

        return boardDTO;
    }

    @Override
    public BoardDTO list(BoardDTO boardDTO) throws Exception {

        Option option = boardDTO.getOption();
        Page page = boardDTO.getPage();

        int totalCount = mapper.countWithKeyword(option);

        int pageNum = page.getPageNum();
        int rowsPerPage = page.getRowsPerPage();
        int pageCount = page.getPageCount();

        page = new Page(pageNum, rowsPerPage, pageCount, totalCount);

        boardDTO.setPage(page);

        List<Board> boardList = mapper.boardList(boardDTO);
        boardDTO.setBoardList(boardList);

        return boardDTO;
    }

    @Override
    public int insert(Board board) throws Exception {
        int result = mapper.insert(board); // 등록된 게시글 행의 수 반환
        if(result > 0){ // 게시글이 먼저 등록되었을 때
            MultipartFile[] file = board.getFile();
            // 밑에 파일 업로드 함수를 쓴 이후에 파일 복사
            List<Files> fileList = uploadFiles(file);
            // DB 파일 경로 등록
            for (Files uploadFile: fileList) {
                mapper.uploadFile(uploadFile);
            }
            //            uploadFiles( file);
        }
        return result;
    }

    @Override
    public Board read(int boardNo) throws Exception {
        return mapper.read(boardNo);
    }

    @Override
    public int update(Board board) throws Exception {
        return mapper.update(board);
    }

    @Override
    public int delete(int boardNo) throws Exception {
        return mapper.delete(boardNo);
    }

    @Override
    public int count() throws Exception {
        return mapper.count();
    }

    public List<Files> uploadFiles(MultipartFile[] files) throws Exception{

        List<Files> fileList = new ArrayList<Files>();

        // 업로드 경로에 파일을 복사
        for (MultipartFile file: files) {
            // 파일 존재여부 확인
            if(file.isEmpty()){
                continue;
            }
            // 파일명 중복 방지
            // - UID를 파일명에 붙임
            // - 날짜 / 시간(밀리초 단위) 파일명에 붙임
            UUID uid = UUID.randomUUID();
            log.info("uid: " + uid);

            // 실제 원본 파일 이름
            String originalFileName = file.getOriginalFilename();

            //UID_강아지.png
            String uploadFileName = uid.toString() + "_" + originalFileName;

            // 업로드 폴더에 업로드할 파일 복사
            byte[] fileData = file.getBytes();      // 파일 데이터
            File target = new File(uploadPath, uploadFileName);
            FileCopyUtils.copy(fileData, target);

            Files uploadFile = new Files();
            uploadFile.setFilePath(uploadPath + "/" + uploadFileName); // 업로드 파일 전체 경로
            uploadFile.setFileName(uploadFileName); // 파일명
            uploadFile.setParentTable("board");     // 부모 테이블
            uploadFile.setParentPk("board_no");     // 부모 pk 컬럼명
            fileList.add(uploadFile);

        }
//        return null; // 참조타입이면 null 쓸 수 있음 byte, int, double, boolean....등 기본타입은 null 못씀
        return fileList;
    }

    public List<Files> uploadFiles(MultipartFile[] files, String parentTable, String parentPk) throws Exception{

        List<Files> fileList = new ArrayList<Files>();

        // 업로드 경로에 파일을 복사
        for (MultipartFile file: files) {
            // 파일 존재여부 확인
            if(file.isEmpty()){
                continue;
            }
            // 파일명 중복 방지
            // - UID를 파일명에 붙임
            // - 날짜 / 시간(밀리초 단위) 파일명에 붙임
            UUID uid = UUID.randomUUID();
            log.info("uid: " + uid);

            // 실제 원본 파일 이름
            String originalFileName = file.getOriginalFilename();
            // 파일 사이즈
            long fileSize = file.getSize();

            //UID_강아지.png
            String uploadFileName = uid.toString() + "_" + originalFileName;

            // 업로드 폴더에 업로드할 파일 복사
            byte[] fileData = file.getBytes();      // 파일 데이터
            File target = new File(uploadPath, uploadFileName);
            FileCopyUtils.copy(fileData, target);

            Files uploadFile = new Files();
            uploadFile.setFilePath(uploadPath + "/" + uploadFileName); // 업로드 파일 전체 경로
            uploadFile.setFileName(uploadFileName);     // 파일명
            uploadFile.setFileSize(fileSize);           // 파일 사이즈
            uploadFile.setParentTable(parentTable);     // 부모 테이블
            uploadFile.setParentPk(parentPk);           // 부모 pk 컬럼명


            fileList.add(uploadFile);

        }
//        return null; // 참조타입이면 null 쓸 수 있음 byte, int, double, boolean....등 기본타입은 null 못씀
        return fileList;
    }

}
