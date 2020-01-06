package com.example.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/final")
	public String goToFinal() {
		return "final";
	}
}
