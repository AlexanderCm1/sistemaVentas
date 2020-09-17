package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.PersonaDao;
import com.example.sysventas_EternalBlue.entity.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int create(Persona p) {
		String sql = "INSERT INTO persona(nombres,apellidos,dni) VALUES (?,?,?)";
		// VALUES ('', 'david', 'reyna', '323322');
		return jdbcTemplate.update(sql,p.getNombres(),p.getApellidos(),p.getDni());
	}

	@Override
	public int update(Persona p) {
		String sql = "update persona set nombres=?,apellidos=?,dni=? where idpersona=?";
		return jdbcTemplate.update(sql,p.getNombres(),p.getApellidos(),p.getDni(),p.getIdpersona());
	}

	@Override
	public int delete(int id) {
		String sql= "delete from persona where idpersona=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Persona read(int id) {

		String sql = "select * from persona where idpersona=?";
		
		return jdbcTemplate.queryForObject(sql, Persona.class);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		
		String sql="select * from persona";
		return jdbcTemplate.queryForList(sql);
	}
	

}
