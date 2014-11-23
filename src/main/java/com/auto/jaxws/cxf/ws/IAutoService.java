package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;
import com.auto.jaxws.cxf.model.AutoImage;
import com.auto.jaxws.cxf.model.AutoSubCategory;
import com.auto.jaxws.cxf.model.User;

import org.apache.cxf.annotations.GZIP;

/**
 * 
 * @author furkanzumrut.com
 *
 */
@GZIP
@WebService(targetNamespace = "http://webservice.autoservice", name = "AutoServiceWS")
public interface IAutoService {

	/* Auto */
	public void addAuto(Auto auto);
	public List<Auto> getAllAutos();
	public Auto getAuto(Integer autoid);
	public List<Auto> getAllAutosNames();
	
	
	/* AutoCategory */
	public List<AutoCategory> getAllCategory();
	public void addAutoCategory(AutoCategory autocategory);
	
	/* AutoSubCategory */
	public void addAutoSubCategory(AutoSubCategory autosubcategory);
	
	/* AutoImage */
	public List<AutoImage> getAllImageByAutoId(Integer autoid);
	public void addAutoImage(AutoImage autoimage);
	
	/* User */
	public User getUser(String username);

	/* Other */
	public String getReturnWork();
	public void sendMailPassword(String username);

}
