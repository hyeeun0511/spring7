package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired  // IOC컴테이너에서 시작할때 객체를 주입
	HttpSession session;
	
	// 로그아웃
	@GetMapping("/member/logout")
	public String logout() {
		session.invalidate(); // 모든 세션 초기화(삭제)
		return "redirect:/";
	}//logout
	
	
	// 로그인
	@GetMapping("/member/login")
	public String login(String flag,Model model) {
		System.out.println("flag:"+flag);
		model.addAttribute("flag", flag);
		return "login";
	}//login
	
	// 로그인 확인
	@PostMapping("/member/login")
	public String login(String id,String pw) {
		if(id.equals("aaa")&&pw.equals("1111")) {
			session.setAttribute("session_id", id);
			return "redirect:/?flag=1";
		}else {
			return "redirect:/member/login?flag=2";
		}
	}
	


}
