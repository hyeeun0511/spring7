package com.java.dto;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder              //부분생성자
@AllArgsConstructor   //전체생성자
@NoArgsConstructor    //기본생성자
@Data                 //getter, setter
public class BoardDto {
	
//	//순서 지켜서 입력해야함
//	public BoardDto(Integer bno,String bcontent,String btitle) { 
//		
//	}

	
	private Integer bno;
	private String btitle;
	private String bcontent;
	private String id;
	private int bgroup;
	private int bstep;
	private int bindent;
	private int bhit;
	private String bfile;
	private Timestamp bdate;

}
