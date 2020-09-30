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

import com.example.sysventas_EternalBlue.entity.Persona;
import com.example.sysventas_EternalBlue.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> listar(){
		return personaService.readAll();
	}
	@GetMapping("/{id}")
	public Persona read(@PathVariable int id) {
		return personaService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}
	@PostMapping("/persona")
	public int create(@RequestBody Persona p) {
		return personaService.create(p);
	}
	@PutMapping("/edit/{id}")
	public int update(@RequestBody Persona p,@PathVariable int id) {
		Persona pe = personaService.read(id);
		pe.setNombres(p.getNombres());
		pe.setApellidos(p.getApellidos());
		pe.setDni(p.getDni());
		
		return personaService.update(pe);
	}

}
