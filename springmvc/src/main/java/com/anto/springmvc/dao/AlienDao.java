package com.anto.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anto.springmvc.model.Alien;

import org.springframework.transaction.annotation.Transactional;
// import org.springframework.stereotype.Repository;
// import jakarta.transaction.Transactional;


@Component
public class AlienDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Alien> getAliens()
	{
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens= session.createQuery("from Alien", Alien.class).list();
		
		return aliens;
	}
	
	@Transactional
	public void addAlien(Alien a)
	{
		Session session = sessionFactory.getCurrentSession();
		// session.save(a); -> deprecated
		session.persist(a);
	}
	
	@Transactional
	public Alien getAlien(int aid) {
		Session session = sessionFactory.getCurrentSession();
		Alien a = session.get(Alien.class, aid);
		
		return a;
	}
}
