package com.example.sysventas_EternalBlue.service;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);
	int update(Usuario u);
	int delete(Usuario u);
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
