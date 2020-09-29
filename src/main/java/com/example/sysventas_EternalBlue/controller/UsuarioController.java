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

import com.example.sysventas_EternalBlue.entity.Usuario;
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
	@GetMapping("/lista/{id}")
	public Usuario read(@PathVariable int id) {
		return usuarioservice.read(id);
	}
	@DeleteMapping("/lista/{id}")
	public int delete(@PathVariable int id) {
		return usuarioservice.delete(id);
	}
	@PostMapping("/lista")
	public int create(@RequestBody Usuario u) {
		return usuarioservice.create(u);
	
	}
	@PutMapping("/lista/{id}")
	public int update(@RequestBody Usuario u, @PathVariable int id)
	{
		Usuario us = new Usuario();
		us.setNomuser(u.getNomuser());
		us.setClave(u.getClave());
		return usuarioservice.update(us);
		
		
	}
	
	
}
