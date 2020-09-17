package com.example.sysventas_EternalBlue.dao;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Persona;

public interface PersonaDao {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	List<Map<String, Object>> readAll();

}
