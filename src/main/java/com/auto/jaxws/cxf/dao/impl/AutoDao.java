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
import com.auto.jaxws.cxf.model.AutoFuel;
import com.auto.jaxws.cxf.model.AutoGear;
import com.auto.jaxws.cxf.model.AutoImage;
import com.auto.jaxws.cxf.model.AutoInterrior;
import com.auto.jaxws.cxf.model.AutoRim;
import com.auto.jaxws.cxf.model.AutoSubCategory;
import com.auto.jaxws.cxf.model.AutoTire;
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
	public List<AutoSubCategory> selectAllSubCategorybyCategoryId(int categoryid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		
		Query query = session.createQuery("SELECT a from AutoSubCategory a where categoryid = :categoryid");
		query.setParameter("categoryid", categoryid);
		return query.list();
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

	@Override
	public List<AutoImage> findImagesByAutoId(int id) {
		Session session = getSessionFactory().getCurrentSession();

		session.beginTransaction();
		

		Query query = session.createQuery("SELECT a from AutoImage a where autoid = :id ");
		query.setParameter("id", id);
		
		
		List<AutoImage> autoimages = (List<AutoImage>) query.list();
		
		session.getTransaction().commit();
		return autoimages;
	}

	@Override
	@Transactional
	public void AutoCategoryInsert(AutoCategory autocategory) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autocategory);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoSubCategoryInsert(AutoSubCategory autosubcategory) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autosubcategory);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoImageInsert(AutoImage autoimage) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autoimage);
		session.getTransaction().commit();
		
	}

	@Override
	public List<AutoFuel> selectAllFuel() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoFuel.class);
		
		@SuppressWarnings("unchecked")
		List<AutoFuel> persons = (List<AutoFuel>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public List<AutoGear> selectAllGear() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoGear.class);
		
		@SuppressWarnings("unchecked")
		List<AutoGear> persons = (List<AutoGear>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public List<AutoInterrior> selectAllInterrior() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoInterrior.class);
		
		@SuppressWarnings("unchecked")
		List<AutoInterrior> persons = (List<AutoInterrior>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public List<AutoRim> selectAllRim() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoRim.class);
		
		@SuppressWarnings("unchecked")
		List<AutoRim> persons = (List<AutoRim>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public List<AutoTire> selectAllTire() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AutoTire.class);
		
		@SuppressWarnings("unchecked")
		List<AutoTire> persons = (List<AutoTire>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}

	@Override
	public void deleteAuto(int id) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from Auto where autoid = :autoid ");
		q.setParameter("autoid", id);
		Auto auto = (Auto)q.list().get(0);
		session.delete(auto);
		
		session.getTransaction().commit();	
		
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
	public List<Auto> selectNotSoldAuto() {
		Session session = getSessionFactory().getCurrentSession();

		session.beginTransaction();
		

		Query query = session.createQuery("SELECT a from Auto a, AutoSales b where sold <> 1 and a.autoid = b.autoid");
		
		
		return query.list();
	}

	@Override
	public Integer findAutoSubCategoryIdByName(String subcategoryname) {
		Session session = getSessionFactory().getCurrentSession();

		session.beginTransaction();
		

		Query query = session.createQuery("SELECT a.subcategoryid from AutoSubCategory a where subcategoryname = :subcategoryname");
		query.setParameter("subcategoryname", subcategoryname);
		
		
		return (Integer)query.list().get(0);
	}

	@Override
	public Integer findAutoByName(String autoname) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("SELECT a.autoid from Auto a where autoname = :autoname");
		query.setParameter("autoname", autoname);
		
		
		return (Integer)query.list().get(0);
	}

	@Override
	public void AutoImageInsert2(int autoimageid, String autourl, int autoid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql = "INSERT INTO AutoImage (autoimageid,autourl,autoid) VALUES(:autoimageid,:autourl, :autoid)";
		Query query = session.createSQLQuery(hql);
		query.setParameter("autourl", autourl);
		query.setParameter("autoid", autoid);
		query.setParameter("autoimageid", autoimageid);
		List result = query.list();
		session.getTransaction().commit();
	}

	@Override
	public void update(Auto auto) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(auto);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoFuelInsert(AutoFuel autofuel) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autofuel);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoGearInsert(AutoGear autogear) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autogear);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoInterriorInsert(AutoInterrior autointerrior) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autointerrior);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoRimInsert(AutoRim autorim) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autorim);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoTireInsert(AutoTire autotire) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(autotire);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void UserInsert(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoCategoryUpdate(AutoCategory autocategory) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autocategory);
		session.getTransaction().commit();
	}

	@Override
	@Transactional
	public void AutoSubCategoryUpdate(AutoSubCategory autosubcategory) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autosubcategory);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoFuelUpdate(AutoFuel autofuel) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autofuel);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoGearUpdate(AutoGear autogear) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autogear);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoInterriorUpdate(AutoInterrior autointerrior) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autointerrior);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoRimUpdate(AutoRim autorim) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autorim);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void AutoTireUpdate(AutoTire autotire) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(autotire);
		session.getTransaction().commit();
		
	}

	@Override
	@Transactional
	public void UserUpdate(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteAutoCategory(int autocategoryid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoCategory where autocategoryid = :autocategoryid ");
		q.setParameter("autocategoryid", autocategoryid);
		AutoCategory autocategory = (AutoCategory)q.list().get(0);
		session.delete(autocategory);
		session.getTransaction().commit();	
		
	}

	@Override
	public void deleteAutoSubCategory(int autosubcategoryid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoSubCategory where autosubcategoryid = :autosubcategoryid ");
		q.setParameter("autosubcategoryid", autosubcategoryid);
		AutoSubCategory autosubcategory = (AutoSubCategory)q.list().get(0);
		session.delete(autosubcategory);
		session.getTransaction().commit();	
		
	}

	@Override
	public void deleteAutoFuel(int autofuelid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoFuel where autofuelid = :autofuelid ");
		q.setParameter("autofuelid", autofuelid);
		AutoFuel autofuel = (AutoFuel)q.list().get(0);
		session.delete(autofuel);
		session.getTransaction().commit();	
		
	}

	@Override
	public void deleteAutoGear(int autogearid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoGear where autogearid = :autogearid ");
		q.setParameter("autogearid", autogearid);
		AutoGear autogear = (AutoGear)q.list().get(0);
		session.delete(autogear);
		session.getTransaction().commit();	
		
	}

	@Override
	public void deleteAutoInterrior(int autointerriorid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoInterrior where autointerriorid = :autointerriorid ");
		q.setParameter("autointerriorid", autointerriorid);
		AutoInterrior autointerrior = (AutoInterrior)q.list().get(0);
		session.delete(autointerrior);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteAutoRim(int autorimid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoRim where autorimid = :autorimid ");
		q.setParameter("autorimid", autorimid);
		AutoRim autorim = (AutoRim)q.list().get(0);
		session.delete(autorim);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteAutoTire(int autotireid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from AutoTire where autotireid = :autotireid ");
		q.setParameter("autotireid", autotireid);
		AutoTire autotire = (AutoTire)q.list().get(0);
		session.delete(autotire);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteUser(int userid) {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from User where userid = :userid ");
		q.setParameter("userid", userid);
		User user = (User)q.list().get(0);
		session.delete(user);
		session.getTransaction().commit();
		
	}

	@Override
	public Integer findAutoCategoryIdByName(String autocategoryname) {
		Session session = getSessionFactory().getCurrentSession();

		session.beginTransaction();
		

		Query query = session.createQuery("SELECT a.autocategoryid from AutoCategory a where autocategoryname = :b");
		query.setParameter("b", autocategoryname);
		
		
		return (Integer)query.list().get(0);
	}

	@Override
	public Integer findAutoTireIdByName(String autotirename) {
		Session session = getSessionFactory().getCurrentSession();

		session.beginTransaction();
		

		Query query = session.createQuery("SELECT a.autotireid from AutoTire a where autotirename = :autotirename");
		query.setParameter("autotirename", autotirename);
		
		
		return (Integer)query.list().get(0);
	}


}
