package com.kh.app11.menu.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app11.menu.model.vo.menuVo;

@Controller
@RequestMapping("menu")
public class MenuController {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@GetMapping("insert")
	public String insert() {
	
		return"menu/insert";
	}
	
	@PostMapping("insert")
	public String insert(menuVo m) {
		
	String sql= "INSERT INTO "
	sqlSession.insert("menu.insertMenu",m);
	return "redirect:/menu/insert";
		}
	}
