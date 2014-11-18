package com.auto.jaxws.cxf.dao.impl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.auto.jaxws.cxf.dao.IAutoDao;
import com.auto.jaxws.cxf.model.Auto;

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
	public Auto findById(int id) {
		
		Session session = getSessionFactory().getCurrentSession();
		//Session session = getSessionFactory().openSession();
		session.beginTransaction();
		
		//USING THIS
		//Criteria criteria = session.createCriteria(Auto.class).add(Restrictions.eq("autoid", id));
		//***

		//Query query = session.createQuery("SELECT a from Auto a where autoid = :id ");

		//Query query = session.createQuery("SELECT a.autoid from Auto a where autoid = :id ");

		
		//query.setParameter("id", id);
		//Auto auto = (Auto) query.list().get(0);
		Auto auto = (Auto) session.get(Auto.class, id);
		
		//criteria.add(Restrictions.eq("autoid", id));
		//Auto auto = (Auto) criteria.list().get(0);
		
		session.getTransaction().commit();
		
		return auto;
	}

}
