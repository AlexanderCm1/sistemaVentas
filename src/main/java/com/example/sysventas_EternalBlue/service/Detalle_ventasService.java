package com.example.sysventas_EternalBlue.service;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Detalle_ventas;

public interface Detalle_ventasService {
	int create(Detalle_ventas r);
	int update(Detalle_ventas r);
	int delete(Detalle_ventas r);
	Detalle_ventas read(int id);
	List<Map<String,Object>> readAll();
}
