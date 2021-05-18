package com.lin.s2.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	public String save(MultipartFile multipartFile,String filePath)throws Exception{
		//1.경로 설정
		//파일 저장
		//배포할 때 target이라는 폴더가 자동으로 생성된다.
		//어느 폴더에 저장할거야?
		
		//2.저장할 파일명을 생성
		String fileName = UUID.randomUUID().toString()+"_"+multipartFile.getOriginalFilename();
		
		//3. 파일 전송하기
		file = new File(file, fileName); // (경로명,파일명)
		
		//transfer
		multipartFile.transferTo(file);
		
		//FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		//저장할 파일이름을 리턴한다.
		return fileName;
		
	}
	

}
