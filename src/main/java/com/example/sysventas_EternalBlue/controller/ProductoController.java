package com.example.sysventas_EternalBlue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sysventas_EternalBlue.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/producto")
	public List<Map<String, Object>> listar(){
		return productoService.readAll();
	}

}
