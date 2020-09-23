package com.example.sysventas_EternalBlue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sysventas_EternalBlue.dao.Detalle_ventaDao;
import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.dao.UsuarioDao;
import com.example.sysventas_EternalBlue.dao.VentasDao;
import com.example.sysventas_EternalBlue.entity.Detalle_ventas;
import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.entity.Usuario;
import com.example.sysventas_EternalBlue.entity.Ventas;

@SpringBootTest
class SysventasEternalBlueApplicationTests {
	@Autowired
	
	private RolDao rolDao;
	
	@Test
	void contextLoads() {
	
		//Rol r = new Rol();
	//	r.setNombre("Gerente");
		//System.out.println(rolDao.delete(3));
		
		System.out.println(rolDao.read(2).getNomrol());
		
	}

}
