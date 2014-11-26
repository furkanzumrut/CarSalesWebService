package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

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
	public List<Auto> getNotSoldAutos();
	public Auto getAuto(Integer autoid);
	public List<Auto> getAllAutosNames();
	public void deleteAutoById(Integer autoid);
	
	/* AutoCategory */
	public List<AutoCategory> getAllCategory();
	public void addAutoCategory(AutoCategory autocategory);
	
	/* AutoSubCategory */
	public void addAutoSubCategory(AutoSubCategory autosubcategory);
	public List<AutoSubCategory> getAllSubCategoryByCategoryId(int categoryid);
	public List<AutoSubCategory> getAllSubCategory();
	public Integer getAutoSubCategoryIdByName(String subcategoryname);
	
	/* AutoImage */
	public List<AutoImage> getAllImageByAutoId(Integer autoid);
	public void addAutoImage(AutoImage autoimage);
	
	
	/* AutoFuel */
	public List<AutoFuel> getAllFuel();
	
	/* AutoGear */
	public List<AutoGear> getAllGear();
	
	/* AutoInterrior */
	public List<AutoInterrior> getAllInterrior();
	
	/* AutoRim */
	public List<AutoRim> getAllAutoRim();
	
	/* AutoTire */
	public List<AutoTire> getAllTire();
	
	/* User */
	public User getUser(String username);

	/* Other */
	public String getReturnWork();
	public void sendMailPassword(String username);

}
