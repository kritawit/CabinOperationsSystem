package com.bangkokair.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bangkokair.model.Authorities;

@Repository
public class AuthoritiesDaoImpl implements AuthoritiesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Authorities findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Authorities where authidx = ?");
		query.setInteger(0, id);
		session.flush();
		return (Authorities) query.uniqueResult();
	}

	@Override
	public List<Authorities> findAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Authorities where active = 1");
		List<Authorities> list = query.list();
		session.flush();
		return list;
	}

}