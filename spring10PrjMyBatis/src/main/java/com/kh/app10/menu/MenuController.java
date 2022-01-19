package com.kh.app10.menu;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class MenuController {

	@Autowired
	SqlSession sqlSession;

	@GetMapping("insert")
	public String insert() {
		return "menu/insert";

	}

	@PostMapping("insert")
	public String insert(MenuVo m) {

	}
}