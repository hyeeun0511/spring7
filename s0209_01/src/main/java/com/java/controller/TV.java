package com.java.controller;

import org.springframework.stereotype.Service;

//@Service //Service필수 // TV나 TV2 둘중 하나에만 붙여야함
public class TV implements Product{
	
	@Override
	public String getName() {
		String name = "삼성TV 버전 1";
		return name;
	}

}
