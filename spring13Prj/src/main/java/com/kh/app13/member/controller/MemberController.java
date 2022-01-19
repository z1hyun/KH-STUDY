package com.kh.app13.member.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app13.member.entity.MemberVo;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping("join")
	public String join() {
		return "member/join";
	}
	
	@PostMapping("join")
	public String join(MemberVo memberVo) {
		sqlSession.insert("member.insertMember",memberVo);
		return "redirect:/member/join";	
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("login")
	public String login(MemberVo memberVo, HttpSession session) {
		MemberVo loginUser = sqlSession.selectOne("member.selectMemberLogin",memberVo);
		System.out.println("loginUser::::::\n"+loginUser);
			if(loginUser != null) {
			session.setAttribute("loginUser",loginUser);
			return "redirect:/";
		
		}else{
			System.out.println("�α��ν���!!");
			return "common/errorPage";
		}
	}
}
