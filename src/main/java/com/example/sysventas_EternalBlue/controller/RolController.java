package com.example.sysventas_EternalBlue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.service.RolService;
import java.util.*;

@RestController
@RequestMapping("/roles")
public class RolController {
	
@Autowired
private RolService rolservice;


@GetMapping("/lista")
public List<Map<String,Object>>listar(){
	return rolservice.readAll();
}

@GetMapping("/lista/{id}")
public Rol readRol(@PathVariable int id) {
	return rolservice.read(id);
}
@DeleteMapping("/lista/delete/{id}")
public int delete(@PathVariable int id) {
	return rolservice.delete(id);
	
}
@PostMapping("/lista/rol")
public int create(@RequestBody Rol rol) {
	return rolservice.create(rol);
}

@PutMapping("/lista/edit/rol")
public int update(@RequestBody Rol rol, @PathVariable int id) {
	Rol r = rolservice.read(id);
	r.setNomrol(rol.getNomrol());
	return rolservice.update(r);
}
	
}
