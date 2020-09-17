package com.example.sysventas_EternalBlue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sysventas_EternalBlue.dao.PersonaDao;
import com.example.sysventas_EternalBlue.dao.ProductoDao;
import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.entity.Persona;
import com.example.sysventas_EternalBlue.entity.Producto;
import com.example.sysventas_EternalBlue.entity.Rol;

@SpringBootTest
class SysventasEternalBlueApplicationTests {

	@Autowired
	private PersonaDao personaDao;
	@Autowired
	private RolDao rolDao;
	@Autowired
	private ProductoDao productoDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Usuario");
		System.out.println(rolDao.create(r));
		*/
		System.out.println(personaDao.readAll());
		/*
		Persona p = new Persona(0,"Victor", "Robles", "2501011");
		System.out.println(personaDao.create(p));
		*/
		
		Producto pro = new Producto();
		pro.setNomprod("Dildo");
		pro.setPrecio(77.2);
		pro.setCantidad("22");
		System.out.println(productoDao.create(pro));
		
	}

}
