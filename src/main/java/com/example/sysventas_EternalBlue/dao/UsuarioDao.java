package com.example.sysventas_EternalBlue.dao;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.entity.Usuario;

public interface UsuarioDao {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
