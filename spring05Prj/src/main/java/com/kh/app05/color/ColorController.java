package com.kh.app05.color;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.app05.color.moedl.vo.ColorVo;

@Controller
@RequestMapping("/color")
public class ColorController {

	
	@GetMapping("/select_color")
	public String selectColor() {
		return "color/select_color";
	}
	
	@PostMapping("/select_color")
	public String selectColor(ColorVo colorVo) {
		//다중파라미터를 처리
	
		String[] colors = colorVo.getColor();
		
		for(String s :colors) {
			System.out.println(s);
		}
		return "redirect:color/select_color";
	}
}
