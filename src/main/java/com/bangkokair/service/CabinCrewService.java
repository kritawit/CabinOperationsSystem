package com.bangkokair.service;

import java.util.List;

import com.bangkokair.model.CabinCrew;

public interface CabinCrewService {

	CabinCrew findById(int id);

	CabinCrew findByUsername(String username);

	void save(CabinCrew cabinCrew);

	void deleteByUsername(String username);

	List<CabinCrew> findAllCabinCrew();

}
