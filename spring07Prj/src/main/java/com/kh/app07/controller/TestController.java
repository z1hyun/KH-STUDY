package com.kh.app07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test")
	public String test() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("������ФФ�");
			e.printStackTrace();
		}System.out.println("���Ἲ��!!!");
		return "redirect:/";
	}
}
