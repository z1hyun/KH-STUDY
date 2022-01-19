package com.kh.jihyun01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JihyunController {

	@RequestMapping("/home")
	public String home() {
	return "home";

	}

	@RequestMapping("/test")
	public String test() {
	return "test";
	}

	@RequestMapping("/join")
	public String join() {
	return "join";

	}
	@RequestMapping("/staticViews/staticPage.html")
	public String staticTest() {
	System.out.println("staticTest 접근이 가능할까요?");
		return "none";

	}
}
