package com.jccastro.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/api")
public class indexController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hola!";
	}
	
	
}
