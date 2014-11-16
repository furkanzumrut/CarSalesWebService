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
		Auto araba = new Auto();
		
		
		//auto.setCarid(2);
		try{
		
			//autoService.getAuto(1);
			 araba = autoService.getAuto("16");
		}catch (JDBCException jdbce) {
		    jdbce.getSQLException().getNextException().printStackTrace();
		}
		System.out.println(araba.getAutoname());
		System.out.println(araba.getAutofuel().getAutofuelname());
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
