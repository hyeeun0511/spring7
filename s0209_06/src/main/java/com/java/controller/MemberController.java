package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("/login") // url로 들어오는 부분
	public String login() {
		return "member/login"; // 폴더로 들어오는 부분
	}
	
	@PostMapping("/doLogin")
	public String doLogin() {
		return "member/doLogin";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "member/logout";
	}

}
