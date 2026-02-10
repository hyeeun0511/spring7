package com.java.dto;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDto {

	private int bno;
	private String btitle;
	private String bcontent;
	private String id;
	private int ngroup;
	private int bstep;
	private int bindent;
	private int bhit;
	private String bfile;
	private Timestamp bdate;
	
}
