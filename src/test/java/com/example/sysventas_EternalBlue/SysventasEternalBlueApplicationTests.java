package com.example.sysventas_EternalBlue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.entity.Rol;

@SpringBootTest
class SysventasEternalBlueApplicationTests {

	@Autowired
	private RolDao rolDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		System.out.println(rolDao.readAll());
	}

}
