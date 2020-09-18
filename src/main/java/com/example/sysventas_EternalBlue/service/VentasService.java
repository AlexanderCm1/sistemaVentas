package com.example.sysventas_EternalBlue.service;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Ventas;

public interface VentasService {
	int create(Ventas v);
	int update(Ventas v);
	int delete(Ventas v);
	Ventas read(int id);
	List<Map<String,Object>> readAll();
}
