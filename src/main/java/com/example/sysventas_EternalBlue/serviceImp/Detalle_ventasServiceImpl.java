package com.example.sysventas_EternalBlue.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysventas_EternalBlue.dao.Detalle_ventaDao;
import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.entity.Detalle_ventas;
import com.example.sysventas_EternalBlue.service.Detalle_ventasService;
@Service
public class Detalle_ventasServiceImpl implements Detalle_ventasService {
	@Autowired
	private Detalle_ventaDao detalle_ventadao;
	@Override
	public int create(Detalle_ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle_ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Detalle_ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_ventas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_ventadao.readAll();
	}

}
