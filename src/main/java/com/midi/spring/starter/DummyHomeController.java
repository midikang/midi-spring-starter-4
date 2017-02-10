package com.midi.spring.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyHomeController {

	@RequestMapping("/")
	public String redirectToFlow() {
		return "redirect:/count"; 
	}
	
}
