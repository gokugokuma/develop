package com.develop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
	
	@RequestMapping("/")
	public String init() {
		return "hello world";
	}

}
