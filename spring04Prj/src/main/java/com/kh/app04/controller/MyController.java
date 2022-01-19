package com.kh.app04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	
	/**
	 * 1.메소드 접근제한자는 무조건 public
	 * 2.return값은 주소,가지고 있어야함
	 * 3.매개변수는 있어도되고 없어도됨
	 * 4.메소드 이름은 자유
	 */
	@RequestMapping(value="/home")
	public String home() {
		return "/WEB-INF/views/home.jsp";
		
	}
}


