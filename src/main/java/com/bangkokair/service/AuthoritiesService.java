package com.bangkokair.service;

import java.util.List;

import com.bangkokair.model.Authorities;

public interface AuthoritiesService {

	List<Authorities> findAll();

	Authorities findById(int id);

}