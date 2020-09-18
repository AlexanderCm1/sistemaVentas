package com.example.sysventas_EternalBlue.dao;

import com.example.sysventas_EternalBlue.entity.Rol;
import java.util.*;

public interface RolDao {
	int create(Rol r);
	int update(Rol r);
	int delete(Rol r);
	Rol read(int id);
	List<Map<String,Object>> readAll();
}
