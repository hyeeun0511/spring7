package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
	
	// 로그인
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// 로그인 확인
	@PostMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id : " + id); // console 출력
		System.out.println("pw : " + pw); // console 출력
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "doLogin";
	}//login (doLogin) : 로그인확인
	
	// 회원가입
	@GetMapping("/join")
	public String join() {
		return "join";
	}

}
