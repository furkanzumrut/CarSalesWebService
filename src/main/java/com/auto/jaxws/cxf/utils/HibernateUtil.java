package com.auto.jaxws.cxf.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.auto.jaxws.cxf.model.Auto;

public class HibernateUtil {
	private static final SessionFactory concreteSessionFactory;
	static {
		try {

			concreteSessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return concreteSessionFactory.openSession();
	}

	public static void main(String... args) {
		Session session = getSession();
		session.beginTransaction();

		Auto auto = (Auto) session.get(Auto.class, 1);
		System.out.println(auto.getAutocategory());
		
		session.getTransaction().commit();
		session.close();
	}
}
