package com.bangkokair.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bangkokair.model.CabinCrew;

@Repository
public class CabinCrewDaoImpl implements CabinCrewDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public CabinCrew findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CabinCrew findByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from CabinCrew Where username = ?");
		query.setString(0, username);
		CabinCrew cabinCrew = (CabinCrew) query.uniqueResult();
		if (cabinCrew != null) {
			Hibernate.initialize(cabinCrew.getAuthorities());
		}
		return cabinCrew;
	}

	@Override
	public void save(CabinCrew cabinCrew) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cabinCrew);
		session.flush();
	}

	@Override
	public void deleteByUsername(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CabinCrew> findAllCabinCrew() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from CabinCrew Where active = 1");
		List<CabinCrew> list = query.list();
		return list;
	}

}
