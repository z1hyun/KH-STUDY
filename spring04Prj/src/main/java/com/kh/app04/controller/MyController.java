package com.kh.app04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	
	/**
	 * 1.�޼ҵ� ���������ڴ� ������ public
	 * 2.return���� �ּ�,������ �־����
	 * 3.�Ű������� �־�ǰ� �����
	 * 4.�޼ҵ� �̸��� ����
	 */
	@RequestMapping(value="/home")
	public String home() {
		return "/WEB-INF/views/home.jsp";
		
	}
}


