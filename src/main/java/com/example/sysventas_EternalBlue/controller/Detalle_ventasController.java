package com.example.sysventas_EternalBlue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sysventas_EternalBlue.entity.Detalle_ventas;
import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.service.Detalle_ventasService;
import com.example.sysventas_EternalBlue.service.UsuarioService;

@RestController
@RequestMapping("/detalle")
public class Detalle_ventasController {
	@Autowired
	private Detalle_ventasService detalleventaservice;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
		return detalleventaservice.readAll();
	}
	@GetMapping("/lista/{id}")
	public Detalle_ventas read(@PathVariable int id) {
		return detalleventaservice.read(id);
	}
	@PostMapping("/lista")
	public int create(@RequestBody Detalle_ventas r) {
		return detalleventaservice.create(r);
	}
	@DeleteMapping("/lista/{id}")
	public int delete(@PathVariable int id) {
		return detalleventaservice.delete(id);
		
	}
	@PutMapping("/lista/re/{id}")
	public int update(@RequestBody Detalle_ventas r, @PathVariable int id) {
		Detalle_ventas re = detalleventaservice.read(id);
		re.setPrecio(r.getPrecio());
		re.setCantidad(r.getCantidad());
		re.setSubtotal(r.getSubtotal());
		re.setCantidad(r.getIdventas());
		re.setIdproducto(r.getIdproducto());
		return detalleventaservice.update(r);
	}
	
	
	
}
