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
	public enum StatusCodes{
		WHITE(21), BLACK(22), RED(23), YELLOW(24), BLUE(25);
		private Integer status;
		
		StatusCodes(Integer status){
		this.status = status;	
		}
		public Integer getStatus(){return status;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext applicationContext = null;
		//ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();  
		

		AutoService autoService = (AutoService) ctx.getBean("autoService");
		
		
		// auto.setCarid(2);
		
		Auto auto = autoService.getAuto(1);
		System.out.println(auto.getAutocategory().getCategoryname());
			// autoService.getAuto(1);
			
		
		
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
