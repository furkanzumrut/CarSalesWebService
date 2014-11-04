package com.auto.jaxws.cxf.dao.impl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.auto.jaxws.cxf.dao.IAutoDao;
import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.Autocategory;
/**
 * 
 * @author furkanzumrut.com
 *
 */
@Repository
@Transactional
public class AutoDao implements IAutoDao{

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void insert(Auto auto) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(auto);
		session.getTransaction().commit();

	}

	@Override
	public List<Auto> selectAll() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Auto.class);
		
		@SuppressWarnings("unchecked")
		List<Auto> persons = (List<Auto>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}
	
	@Override
	public List<Autocategory> selectAllAutoCategory() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Autocategory.class);
		
		@SuppressWarnings("unchecked")
		List<Autocategory> persons = (List<Autocategory>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}
	
	@Override
	public Auto findById(int id) {
		
		Session session = getSessionFactory().getCurrentSession();
		//Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Auto.class).add(Restrictions.eq("autoid", id));
		//criteria.add(Restrictions.eq("autoid", id));
		Auto auto = (Auto) criteria.list().get(0);
		
		session.getTransaction().commit();
		
		return auto;
	}

}
