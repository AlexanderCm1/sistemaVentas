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
	//private VentasDao ventasdao;
	//private RolDao rolDao;
	//private UsuarioDao usuariodao;
	private Detalle_ventaDao detalle;
	@Test
	void contextLoads() {
		//Rol r = new Rol();
		//r.setNombre("Administrador");
	//	System.out.println(rolDao.create(r));
		
		//Usuario u = new Usuario();
		//u.setIdpersona(1);
		//u.setNomuser("kevinapps");
		//u.setClave("12345");
		//u.setEstado("A");
		//u.setIdrol(1);
		//System.out.println(usuariodao.create(u));
		
		//Ventas v = new Ventas();	
		//v.setFecha("10/05/1500");
		//v.setTipodoc("DNI");
		//v.setNumdoc("544845684");
		//v.setIdpersona(4);
		//System.out.println(ventasdao.create(v));
		
		Detalle_ventas d = new Detalle_ventas();
		d.setPrecio(12.0);
		d.setCantidad(5);
		d.setSubtotal(11.0);
		d.setIdventas(1);
		d.setIdproducto(1);
		
		System.out.println(detalle.create(d));
		
		
		
		
	}

}
