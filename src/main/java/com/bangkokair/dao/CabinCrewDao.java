package com.bangkokair.dao;

import java.util.List;

import com.bangkokair.model.CabinCrew;

public interface CabinCrewDao {

	CabinCrew findById(int id);

	CabinCrew findByUsername(String username);

	void save(CabinCrew cabinCrew);

	void deleteByUsername(String username);

	List<CabinCrew> findAllCabinCrew();
}
