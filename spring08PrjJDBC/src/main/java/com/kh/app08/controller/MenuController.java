package com.kh.app08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private JdbcTemplate jdbcTemplate ;
	@GetMapping("/insert")
	public String insert() {
		return "menu/insert";//WEB-INF/views/menu/insert.jsp
	}
	
	@PostMapping("/insert")
	public String insert(String menu, String price) {
		System.out.println(jdbcTemplate);
		System.out.println("post¿¬°á");
		return "menu/insert";
	}
}
