package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.entity.Rol;

@Repository
public class RolDaoImpl implements RolDao{
@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Rol r) {
		String sql = "insert into rol(nomrol) values(?)";
		
		return jdbctemplate.update(sql,r.getNombre());
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		String sql = "update rol set nomrol = ? where idrol = ?";
		return jdbctemplate.update(sql,r.getNombre(), r.getIdrol());
	}

	@Override
	public int delete(Rol r) {
		// TODO Auto-generated method stub
		String sql = "delete from rol where idrol = ?";
		return jdbctemplate.update(sql,r.getIdrol());
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from rol where idrol = ?";
		return jdbctemplate.queryForObject(sql, Rol.class);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from rol";
		return jdbctemplate.queryForList(sql);
	}

}
