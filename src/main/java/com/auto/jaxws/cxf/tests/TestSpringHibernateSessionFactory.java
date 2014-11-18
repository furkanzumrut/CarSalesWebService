package com.auto.jaxws.cxf.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.JDBCException;
import org.springframework.context.ApplicationContext;




import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;
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
		
		
		// auto.setCarid(2);
		
		Auto auto = autoService.getAuto("4");
		System.out.println(auto.toString());
			// autoService.getAuto(1);
			//autoService.addAuto(new Auto(1, "a", 1990, 12.2, 33, 33, 44, 2, new Date(2014, 2, 22),2, 1.2, new AutoCategory(1)));
		
		
		
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
