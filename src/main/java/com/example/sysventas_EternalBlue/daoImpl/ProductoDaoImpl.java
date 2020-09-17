package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.ProductoDao;
import com.example.sysventas_EternalBlue.entity.Producto;
import com.example.sysventas_EternalBlue.entity.Rol;

@Repository
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Producto p) {
		String sql = "insert into producto(nomprod,precio,cantidad) values(?,?,?)";
		return jdbcTemplate.update(sql,p.getNomprod(),p.getPrecio(),p.getCantidad());
		
	}

	@Override
	public int update(Producto p) {
		String sql = "update producto set nomprod=?,precio=?,cantidad=? where idproducto=?";
		return jdbcTemplate.update(sql,p.getNomprod(),p.getPrecio(),p.getCantidad(),p.getIdproducto());
	}

	@Override
	public int delete(int id) {
		String sql= "delete from producto where idproducto=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Producto read(int id) {
		String sql = "select * from producto where idproducto=?";
		return jdbcTemplate.queryForObject(sql, Producto.class);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from producto";
		return jdbcTemplate.queryForList(sql);
	}

}
