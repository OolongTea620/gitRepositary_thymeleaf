package com.lin.s2.board.qna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qna/**")
public class QnaController {
	
	@ModelAttribute
	public String getBoard() {
		return "qna";
	}
	
	@GetMapping("list")
	public String getList(Model model)throws Exception {
		return "board/list"; //해당 view 로 이동
	}
	
}
