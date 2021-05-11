package com.lin.s2.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		//model.addAttribute("message", "Thymeleaf Project");
		return "index"; // templates/index.html 뷰를 찾는다
	}
}
