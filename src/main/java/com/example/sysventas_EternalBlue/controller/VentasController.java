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

import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.entity.Ventas;
import com.example.sysventas_EternalBlue.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired	
	private VentasService ventasservice;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
		return ventasservice.readAll();
	}
	
	@GetMapping("/lista/{id}")
	public Ventas readVentas(@PathVariable int id) {
		return ventasservice.read(id);
	}
	@DeleteMapping("/lista/delete/{id}")
	public int deleteVentas(@PathVariable int id) {
		return ventasservice.delete(id);
	}
	@PostMapping("/lista")
	public int create(@RequestBody Ventas v ) {
		return ventasservice.create(v);
	}
	
	@PutMapping("/lista/{id}")
	public int update(@RequestBody Ventas v, @PathVariable int id) {
		Ventas ve = ventasservice.read(id);
		ve.setFecha(v.getFecha());
		ve.setTipodoc(v.getTipodoc());
		ve.setNumdoc(v.getNumdoc());
		ve.setIdpersona(v.getIdpersona());
		ve.setIdcliente(v.getIdcliente());
		return ventasservice.update(ve);
	}
	
	
	
}
