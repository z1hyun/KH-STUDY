package com.kh.app05.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.app05.member.model.vo.MemberVo;



@Controller
@RequestMapping("/member")
public class MemberController {
	
//	@RequestMapping(value="/view",method=RequestMethod.GET)
	@GetMapping("/join")
	public String join() {
		System.out.println("join get 요청 처리합니다.");
		return "member/join";
	}
//@RequestMapping(value="/member/join",method=RequestMethod.POST)
	@PostMapping("/join")
	public String jzzz(
			MemberVo m
			){
		System.out.println("join post 요청 처리합니다.");
		
		/*
		 * String id = req.getParameter("id"); 
		 * String pwd = req.getParameter("pwd");
		 * String nick = req.getParameter("nick");
		 */
		System.out.println("id="+m.getId());
		System.out.println("pwd="+m.getPwd());
		System.out.println("nick="+m.getNick());
		System.out.println("age:"+m.getAge());
		
		
		return "member/join_result";
	}
}
