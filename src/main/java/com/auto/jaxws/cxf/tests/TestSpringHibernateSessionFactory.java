package com.auto.jaxws.cxf.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.JDBCException;
import org.springframework.context.ApplicationContext;




import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.Autocategory;
import com.auto.jaxws.cxf.ws.AutoService;
/**
 * 
 * @author furkanzumrut.com
 *
 */
public class TestSpringHibernateSessionFactory {
	private static final ApplicationContext ctx =
		    new FileSystemXmlApplicationContext(
		        "src/main/webapp/WEB-INF/applicationContext.xml"
		    );
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext applicationContext = null;
		//ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();  
		

		AutoService autoService = (AutoService) ctx.getBean("autoService");
		List <Autocategory> liste = new ArrayList<Autocategory>();
		List <Auto> arabalar = new ArrayList<Auto>();
		
		//auto.setCarid(2);
		try{
		
			//autoService.getAuto(1);
			 liste = autoService.getAllAutoCategory();
			 arabalar = autoService.getAllAutos();
		}catch (JDBCException jdbce) {
		    jdbce.getSQLException().getNextException().printStackTrace();
		}
		System.out.println(liste.get(0).getCategoryname());
		System.out.println(arabalar.get(0).getAutoname());
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
