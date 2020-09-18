package com.example.sysventas_EternalBlue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sysventas_EternalBlue.service.Detalle_ventasService;
import com.example.sysventas_EternalBlue.service.UsuarioService;

@RestController
@RequestMapping("/detalleventa")
public class Detalle_ventasController {
	@Autowired
	private Detalle_ventasService detalleventaservice;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
		return detalleventaservice.readAll();
	}
}
