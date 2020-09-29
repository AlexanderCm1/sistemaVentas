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
		return ventasdao.create(v);
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return ventasdao.update(v);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ventasdao.delete(id);
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return ventasdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasdao.readAll();
	}

}
