package com.kh.app05.fruit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/fruit")
public class FruitController {
	@GetMapping("/select_fruit")
	public String selectFruit() {
		return "fruit/select_fruit";
		
	}
	@PostMapping("/fruit")
	public String selectFruit(HttpServletRequest req) {
		return "redirect:fruit/select_fruit"
	}
}
