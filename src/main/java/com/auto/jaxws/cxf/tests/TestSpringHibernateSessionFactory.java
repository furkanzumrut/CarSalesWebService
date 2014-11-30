package com.auto.jaxws.cxf.tests;

import java.util.Date;

import org.hibernate.JDBCException;
import org.springframework.context.ApplicationContext;




import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;
import com.auto.jaxws.cxf.model.AutoFuel;
import com.auto.jaxws.cxf.model.AutoGear;
import com.auto.jaxws.cxf.model.AutoImage;
import com.auto.jaxws.cxf.model.AutoInterrior;
import com.auto.jaxws.cxf.model.AutoRim;
import com.auto.jaxws.cxf.model.AutoSubCategory;
import com.auto.jaxws.cxf.model.AutoTire;
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
		// 
		//ApplicationContext applicationContext = null;
		//ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();  
		

		AutoService autoService = (AutoService) ctx.getBean("autoService");
		
		
		// auto.setCarid(2);
		
		
//		Auto a = new Auto();
//		a.setAutoid(1);
//		a.setAuto100km(11.2);
//		a.setAutocategory(new AutoCategory(1));
//		a.setAutocolor(1);
//		a.setAutofuel(new AutoFuel(1));
//		a.setAutogear(new AutoGear(1));
//		a.setAutohand(1);
//		a.setAutohp(11);
//		a.setAutointerrior(new AutoInterrior(1));
//		a.setAutokm(11);
//		a.setAutomodel(11);
//		a.setAutoname("test");
//		a.setAutoprice(22.2);
//		a.setAutoregisterdate(new Date());
//		a.setAutorim(new AutoRim(1));
//		a.setAutosubcategory(new AutoSubCategory(1));
//		a.setAutotire(new AutoTire(1));
//		a.setAutotype(1);
		
		
		
		try{
			//autoService.addAuto(a);
		}catch (JDBCException jdbce) {
		    jdbce.getSQLException().getNextException().printStackTrace();
		}
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
