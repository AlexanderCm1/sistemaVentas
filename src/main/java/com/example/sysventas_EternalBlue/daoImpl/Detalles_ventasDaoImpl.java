package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.Detalle_ventaDao;
import com.example.sysventas_EternalBlue.entity.Detalle_ventas;
@Repository
public class Detalles_ventasDaoImpl implements Detalle_ventaDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Detalle_ventas r) {
		String sql = "insert into detalle_ventas(precio,cantidad,subtotal,idventas,idproducto) values(?,?,?,?,?)";
		
		return jdbctemplate.update(sql,r.getPrecio(),r.getCantidad(), r.getSubtotal(), r.getIdventas(), r.getIdproducto());
	}

	@Override
	public int update(Detalle_ventas r) {
		String sql = "update detalle_vetas set precio = ? and cantidad = ? and idventas= ? and idproducto = ? where iddetalle_ventas = ?";
		return jdbctemplate.update(sql,r.getPrecio(), r.getCantidad(), r.getIdventas(), r.getIdproducto(), r.getIddetalle_ventas());
	}

	@Override
	public int delete(Detalle_ventas r) {
		String sql = "delete from detalle_ventas where iddetalle_ventas = ?";
		
		return jdbctemplate.update(sql, r.getIddetalle_ventas());
	}

	@Override
	public Detalle_ventas read(int id) {
		String sql = "select * from detalle_ventas where iddetalle_ventas = ?";
		return jdbctemplate.queryForObject(sql, Detalle_ventas.class);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from detalle_ventas";
		return jdbctemplate.queryForList(sql);
	}

}
