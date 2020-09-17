package com.example.sysventas_EternalBlue.service;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Producto;

public interface ProductoService {
	int create(Producto p);
	int update(Producto p);
	int delete(int id);
	Producto read(int id);
	List<Map<String, Object>> readAll();
}
