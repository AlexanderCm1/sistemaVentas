package com.example.sysventas_EternalBlue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sysventas_EternalBlue.dao.UsuarioDao;
import com.example.sysventas_EternalBlue.entity.Usuario;
import com.example.sysventas_EternalBlue.entity.Ventas;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Usuario u) {
		String sql = "insert into usuario(idpersona, nomuser,clave,estado,idrol) values(?,?,?,?,?)";
		
		return jdbctemplate.update(sql,u.getIdpersona() ,u.getNomuser(), u.getClave() , u.getEstado(), u.getIdrol());
	}

	@Override
	public int update(Usuario u) {
		String sql = "update usuario set nomuser = ? , clave = ?  where idpersona = ?";

		return jdbctemplate.update(sql,u.getNomuser(), u.getClave(), u.getIdpersona());
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from usuario";
		return jdbctemplate.queryForList(sql);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from usuario where idpersona = ?";
		return jdbctemplate.queryForObject(sql,  new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from usuario where idpersona = ?";
		return jdbctemplate.update(sql,id);
	}

}
