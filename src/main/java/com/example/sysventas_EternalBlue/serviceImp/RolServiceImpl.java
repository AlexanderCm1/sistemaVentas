package com.example.sysventas_EternalBlue.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysventas_EternalBlue.dao.RolDao;
import com.example.sysventas_EternalBlue.entity.Rol;
import com.example.sysventas_EternalBlue.service.RolService;

@Service
public class RolServiceImpl implements RolService {
@Autowired
private RolDao roldao;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return roldao.create(r);
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return roldao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return roldao.delete(id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return roldao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return roldao.readAll();
	}

}
