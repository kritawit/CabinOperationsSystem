package com.bangkokair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bangkokair.dao.CabinCrewDao;
import com.bangkokair.model.CabinCrew;

@Service
public class CabinCrewServiceImpl implements CabinCrewService {

	@Autowired
	private CabinCrewDao dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public CabinCrew findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CabinCrew findByUsername(String username) {
		return dao.findByUsername(username);
	}

	@Override
	public void save(CabinCrew cabinCrew) {
		cabinCrew.setPassword(passwordEncoder.encode(cabinCrew.getPassword()));
		cabinCrew.setActive(1);
		dao.save(cabinCrew);
	}

	@Override
	public void deleteByUsername(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CabinCrew> findAllCabinCrew() {
		// TODO Auto-generated method stub
		return dao.findAllCabinCrew();
	}

}
