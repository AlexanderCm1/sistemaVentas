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

import com.example.sysventas_EternalBlue.entity.Producto;
import com.example.sysventas_EternalBlue.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> listar(){
		return productoService.readAll();
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id) {
		return productoService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return productoService.delete(id);
	}
	@PostMapping("/producto")
	public int create(@RequestBody Producto p) {
		return productoService.create(p);
	}
	@PutMapping("/edit/{id}")
	public int update(@RequestBody Producto p,@PathVariable int id) {
		Producto pro = productoService.read(id);
		pro.setNomprod(p.getNomprod());
		pro.setPrecio(p.getPrecio());
		pro.setCantidad(p.getCantidad());
		
		return productoService.update(pro);
	}
}
