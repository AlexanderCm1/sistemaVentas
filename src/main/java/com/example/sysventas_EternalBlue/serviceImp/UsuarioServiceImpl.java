package com.example.sysventas_EternalBlue.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.sysventas_EternalBlue.dao.UsuarioDao;
import com.example.sysventas_EternalBlue.entity.Usuario;
import com.example.sysventas_EternalBlue.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
	private UsuarioDao usuariodao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}

}
