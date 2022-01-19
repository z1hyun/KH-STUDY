package com.kh.app09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired//객체를 전달받는 것 DI
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/insert")
	public String insert() {
		return "menu/insert";
	}
	
	@PostMapping("/insert")
	public String insert(String menu,String price) {
		
		String sql = "INSERT INTO MENU(MENU_NAME,MENU_PRICE) VALUES(?,?)";
		Object[] params = new Object[] {menu,price};
	
		jdbcTemplate.update(sql,params);
		return "redirect:/menu/insert/";
	}
	
}
