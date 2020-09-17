package com.example.sysventas_EternalBlue.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysventas_EternalBlue.dao.PersonaDao;
import com.example.sysventas_EternalBlue.entity.Persona;
import com.example.sysventas_EternalBlue.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaDao personaDao;
	@Override
	public int create(Persona p) {
		
		return 0;
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {

		
		return personaDao.readAll();
	}
	
}
