package com.example.sysventas_EternalBlue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sysventas_EternalBlue.service.UsuarioService;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired	
	private UsuarioService usuarioservice;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
		return usuarioservice.readAll();
	}
	
	
}
