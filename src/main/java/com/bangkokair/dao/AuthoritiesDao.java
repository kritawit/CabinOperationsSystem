package com.bangkokair.dao;

import java.util.List;

import com.bangkokair.model.Authorities;

public interface AuthoritiesDao {

	Authorities findById(int id);

	List<Authorities> findAll();

}