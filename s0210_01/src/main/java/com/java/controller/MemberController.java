package com.java.controller;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.MemberDto;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {

    private final FController FController;

    MemberController(FController FController) {
        this.FController = FController;
    }
	
	//@RequestMapping("/login")
	@GetMapping("/login")
	public String login(Integer flag,Model model) {
		System.out.println("flag : " + flag);
		model.addAttribute("flag", flag);
		return "login";
	}//login
	
	@PostMapping("/login")
	//@PostMapping("/doLogin")
	//public String doLogin
	public String login(HttpServletRequest request,Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id : " +id); // console 출력
		System.out.println("pw : " + pw); // console 출력
		// jsp -> request.setAttribute()
		// sptin -> model.addAttribute()
		if(id.equals("aaa") && pw.equals("1111")) {
			return "redirect:/?flag=1";
		}else {
			return "redirect:/login?flag=2";
			// 아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인 해주세요.
			
		}
		
		
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		return "doLogin";
	}//login (doLogin)
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}//join
	
	@GetMapping("/mUpdate")
	public String mUpdate(Model model) {

	    MemberDto mdto = new MemberDto(
	        "aaa", "1111", "홍길동", "010-1111-1111",
	        "aaa@naber.com", "남자", "게임,독서,운동"
	    );

	    model.addAttribute("member", mdto);
	    return "mUpdate";
	}
	
	@PostMapping("/join")
	public String join(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		String hobby = Arrays.toString(hobbys);
		System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s", id,pw,name,phone,email,gender,hobby));
//		System.out.println("id : " + id);
//		System.out.println("pw : " + pw);
//		System.out.println("name : " + name);
//		System.out.println("phone : " + phone);
//		System.out.println("email : " + email);
//		System.out.println("gener : " + gender);
//		System.out.println("hobby : " + String.format(", ", hobby));
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("name", name);
		model.addAttribute("phone", phone);
		model.addAttribute("email", email);
		model.addAttribute("gender", gender);
		model.addAttribute("hobby", String.join(", ", hobby));
		
		return "doJoin";
	}//join (doJoin)

}
