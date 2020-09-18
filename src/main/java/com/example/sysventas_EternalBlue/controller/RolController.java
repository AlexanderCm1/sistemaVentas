package com.example.sysventas_EternalBlue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
