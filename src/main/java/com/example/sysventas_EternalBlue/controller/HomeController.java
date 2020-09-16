package com.example.sysventas_EternalBlue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido Al sistema de ventas :)";
	}
}
