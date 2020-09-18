package com.example.sysventas_EternalBlue.dao;

import java.util.List;
import java.util.Map;


import com.example.sysventas_EternalBlue.entity.Ventas;

public interface VentasDao {
	int create(Ventas v);
	int update(Ventas v);
	int delete(Ventas v);
	Ventas read(int id);
	List<Map<String,Object>> readAll();
}
