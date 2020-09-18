package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.VentasDao;
import com.example.sysventas_EternalBlue.entity.Ventas;
@Repository
public class VentasDaoImpl implements VentasDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Ventas v) {
		String sql = "insert into ventas(fecha,tipodoc,numdoc,idpersona) values(?,?,?,?)";
		return jdbctemplate.update(sql, v.getFecha(), v.getTipodoc(), v.getNumdoc(), v.getIdpersona());
	}

	@Override
	public int update(Ventas v) {
		String sql = "update ventas set fecha ? and tipodoc = ? and numdoc = ? and idpersona = ? and idcliente = ? where idventas  = ?";

		return jdbctemplate.update(sql,v.getFecha(), v.getTipodoc(), v.getNumdoc(), v.getIdpersona(), v.getIdpersona() );
	}
	@Override
	public int delete(Ventas v) {
		String sql = "delete from ventas where idventas = ?";
		return jdbctemplate.update(sql, v.getIdventas());
	}

	@Override
	public Ventas read(int id) {
		String sql = "select * from  usuario where idventas = ?";
		return jdbctemplate.queryForObject(sql, Ventas.class);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from ventas";
		return jdbctemplate.queryForList(sql);
	}

}
