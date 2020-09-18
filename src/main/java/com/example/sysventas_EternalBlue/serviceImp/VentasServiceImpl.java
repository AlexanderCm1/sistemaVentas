package com.example.sysventas_EternalBlue.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysventas_EternalBlue.dao.UsuarioDao;
import com.example.sysventas_EternalBlue.dao.VentasDao;
import com.example.sysventas_EternalBlue.entity.Ventas;
import com.example.sysventas_EternalBlue.service.VentasService;
@Service
public class VentasServiceImpl implements VentasService {
@Autowired
	private VentasDao ventasdao;
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Ventas v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasdao.readAll();
	}

}
