package aloha.utils;

import aloha.mapper.FileMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Slf4j
@Component // 스프링이 시작될 때 스프링 컨테이너에 이 객체를 등록해놓음. 다른 데서 가져와서 의존성을 주입할 수 있도록 bean에 설정 해놓음
public class FileUtils {

    // 파일 삭제
    public boolean deleteFile(String filePath) throws Exception{

        File file = new File(filePath);
        // 실제로 존재하는지 확인해줘야함
        if( file.exists()) {
            // delete() : 파일 삭제
            //            성공 --> true
            //            실패 --> false
            if(file.delete()){
                log.info("파일 삭제 성공!!");
                log.info("삭제된 파일: " + filePath);
                return true;
            } else{
                log.info("파일 삭제 실패!!");
                log.info("잘못된 경로 : " + filePath);
                log.info("파일이 존재하지 않습니다.");
            }
        }
        return false;
    }

}
