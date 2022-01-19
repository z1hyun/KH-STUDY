package com.kh.app12.menu.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app12.menu.entity.MenuVo;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("menu")
public class MenuController {
	
	@Autowired
	SqlSession sqlSession;
	
	@GetMapping("insert")
	public String insert() {
		return "menu/insert";
	}
	
	@PostMapping("insert")
	public String insert(MenuVo m) {
		sqlSession.insert("menu.insertMenu",m);
		return "redirect:/menu/list";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		//DB에서 메뉴 리스트를 가져와야함.
		//가져온 리스트를 화면에 전달해야함.
	List<MenuVo> menuList = sqlSession.selectList("menu.selectMenuList");
	for(MenuVo x:menuList) {
		System.out.println(x);
	}
		model.addAttribute("list",menuList);
		return "menu/list";
	}
	
}

