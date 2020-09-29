package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.VentasDao;
import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.entity.Ventas;
@Repository
public class VentasDaoImpl implements VentasDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Ventas v) {
		String sql = "insert into ventas(fecha,tipodoc,numdoc,idpersona,idcliente) values(?,?,?,?, ?)";
		return jdbctemplate.update(sql, v.getFecha(), v.getTipodoc(), v.getNumdoc(), v.getIdpersona(), v.getIdcliente());
	}

	@Override
	public int update(Ventas v) {
		String sql = "update ventas set fecha =  ?, tipodoc = ? , numdoc = ?, idpersona = ? , idcliente = ? where  idventas  = ?";

		return jdbctemplate.update(sql,v.getFecha(), v.getTipodoc(), v.getNumdoc(), v.getIdpersona(), v.getIdcliente(), v.getIdventas());
	}
	@Override
	public int delete(int id) {
		String sql = "delete from ventas where idventas = ?";
		return jdbctemplate.update(sql, id);
	}

	@Override
	public Ventas read(int id) {
		String sql = "select * from  ventas where idventas = ?";
		return jdbctemplate.queryForObject(sql,  new Object[] {id}, new BeanPropertyRowMapper<Ventas>(Ventas.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from ventas";
		return jdbctemplate.queryForList(sql);
	}

}
