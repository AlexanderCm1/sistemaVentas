package com.example.sysventas_EternalBlue.dao;

import java.util.List;
import java.util.Map;

import com.example.sysventas_EternalBlue.entity.Detalle_ventas;
import com.example.sysventas_EternalBlue.entity.Rol;

public interface Detalle_ventaDao {
	int create(Detalle_ventas r);
	int update(Detalle_ventas r);
	int delete(int id);
	Detalle_ventas read(int id);
	List<Map<String,Object>> readAll();
}
