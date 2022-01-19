package com.kh.app05.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/insert")
	public String insert() {
		// /WEB-INF/views/board/insert.jsp
		return "board/insert";

	}

	@PostMapping("/insert")
	public String insert(String title, String content) {
		System.out.println(title);
		System.out.println(content);
		return "redirect:/board/insert_result";
	}
	
	@GetMapping("/insert_result")
	public String insert_result() {
		return "board/insert_result";
	}
}
