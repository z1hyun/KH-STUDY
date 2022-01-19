package com.kh.test01.cotroller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.test01.model.vo.MenuVo;

@Controller
@RequestMapping("menu")
public class MenuController {

	@Autowired
	private SqlSession sqlSession;
	
	
	@GetMapping("/insert")
	public String insert() {
		return "menu/insert";
	}

	@PostMapping("insert")
	public String insert(MenuVo m) {
		
		sqlSession.insert("menu.menuInsert",m);
		
		return "redirect:/menu/insert";
	}

}
