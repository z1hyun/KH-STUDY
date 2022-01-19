package com.kh.app04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
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
}
