package com.quiz.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMVC {


	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
}
