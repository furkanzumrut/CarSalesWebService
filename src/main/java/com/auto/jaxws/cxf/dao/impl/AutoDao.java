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
import com.auto.jaxws.cxf.model.AutoCategory;
import com.auto.jaxws.cxf.model.AutoSubCategory;
import com.auto.jaxws.cxf.model.User;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Auto> selectAutosName() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();	
		Query query = session.createQuery("SELECT a.autoname from Auto a");
		return query.list();
	}

	@Override
	public List<AutoCategory> selectAllCategory() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoCategory.class);
		
		@SuppressWarnings("unchecked")
		List<AutoCategory> persons = (List<AutoCategory>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public List<AutoSubCategory> selectAllSubCategory() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoSubCategory.class);
		
		@SuppressWarnings("unchecked")
		List<AutoSubCategory> persons = (List<AutoSubCategory>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public User findUserByName(String username) {
		Session session = getSessionFactory().getCurrentSession();
		//Session session = getSessionFactory().openSession();
		session.beginTransaction();
		
		//USING THIS
		Criteria criteria = session.createCriteria(User.class);
		//***

		//Query query = session.createQuery("SELECT a from Auto a where autoid = :id ");

		//Query query = session.createQuery("SELECT username from User where username = :username ");

		
		//query.setParameter("username", username);
		//User user = (User) query.list().get(0);
		//User auto = (User) session.get(User.class, username);
		

		criteria.add(Restrictions.eq("username", username));
		User user = (User) criteria.list().get(0);
		
		session.getTransaction().commit();
		
		return user;
	}



}
