package com.dwa.portada.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Portada {
	@GetMapping("/portada/")
	public String Index()
	{
		return "portada/index";
	}
}
