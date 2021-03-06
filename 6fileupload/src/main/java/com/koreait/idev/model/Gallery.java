package com.koreait.idev.model;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallery {
	private int pno;
	private String title;
	private String filenames; //업로드한 파일명을, 구분해서 나열하고 저장
	private Timestamp wdate;
	
	
	//MultipartFile 은 form 요소의 file 을 전달받아 참조합니다.
	private List<MultipartFile> pics;
}