package com.bangkokair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bangkokair.dao.AuthoritiesDao;
import com.bangkokair.model.Authorities;

@Service
@Transactional
public class AuthoritiesServiceImpl implements AuthoritiesService {

	@Autowired
	private AuthoritiesDao dao;

	@Override
	public List<Authorities> findAll() {
		return dao.findAll();
	}

	@Override
	public Authorities findById(int id) {
		return dao.findById(id);
	}

}
