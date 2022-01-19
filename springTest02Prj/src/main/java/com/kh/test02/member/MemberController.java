package com.kh.test02.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.test02.member.model.vo.MemberVo;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private SqlSession sqlSession;
	// 위에가 바로 DI

	@GetMapping("join")
	public String join() {
		return "member/join";
	}

	@PostMapping("join")
	public String join(MemberVo m) {
		sqlSession.insert("member.insertMember", m);
		return "redirect:/member/join";
	}

	@GetMapping("login")
	public String login() {
		return "member/login";
	}

	@PostMapping("login")
	public String login(MemberVo m, HttpSession session) {
		MemberVo loginUser = sqlSession.selectOne("member.selectMemberLogin", m);

		session.setAttribute("loginUser", loginUser);
		return "redirect:/";
	}

	@GetMapping("userList")
	public String userList(Model model) {
		List<MemberVo> list = sqlSession.selectList("member.selectMemberList");
		model.addAttribute("list",list);
		return "member/userList";
	}
}
