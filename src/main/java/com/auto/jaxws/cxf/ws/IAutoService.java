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
	public void updateAuto(Auto auto);
	public Integer getAutoIdByName(String autoname);
	public List<Auto> getAllAutosNames();
	public void deleteAutoById(Integer autoid);
	
	/* AutoCategory */
	public List<AutoCategory> getAllCategory();
	public void addAutoCategory(AutoCategory autocategory);
	public void updateAutoCategory(AutoCategory autocategory);
	public void deleteAutoCategoryById(Integer autocategoryid);
	public Integer getAutoCategoryIdByName(String autocategoryname);
	
	/* AutoSubCategory */
	public void addAutoSubCategory(AutoSubCategory autosubcategory);
	public List<AutoSubCategory> getAllSubCategoryByCategoryId(int categoryid);
	public List<AutoSubCategory> getAllSubCategory();
	public Integer getAutoSubCategoryIdByName(String subcategoryname);
	public void updateAutoSubCategory(AutoSubCategory autosubcategory);
	public void deleteAutoSubCategoryById(Integer autosubcategoryid);
	
	/* AutoImage */
	public List<AutoImage> getAllImageByAutoId(Integer autoid);
	public void addAutoImage(AutoImage autoimage);
	public void addAutoImage2(int autoimageid, String autourl, int autoid);
	
	/* AutoFuel */
	public List<AutoFuel> getAllFuel();
	public void addAutoFuel(AutoFuel autofuel);
	public void updateAutoFuel(AutoFuel autofuel);
	public void deleteAutoFuelById(Integer autofuelid);
	
	/* AutoGear */
	public List<AutoGear> getAllGear();
	public void addAutoGear(AutoGear autogear);
	public void updateAutoGear(AutoGear autogear);
	public void deleteAutoGearById(Integer autogearid);
	
	/* AutoInterrior */
	public List<AutoInterrior> getAllInterrior();
	public void addAutoInterrior(AutoInterrior autointerrior);
	public void updateAutoInterrior(AutoInterrior autointerrior);
	public void deleteAutoInterriorById(Integer autointerriorid);
	
	/* AutoRim */
	public List<AutoRim> getAllAutoRim();
	public void addAutoRim(AutoRim autorim);
	public void updateAutoRim(AutoRim autorim);
	public void deleteAutoRimById(Integer autorimid);
	public Integer getAutoRimIdByName(String autorimname);
	
	/* AutoTire */
	public List<AutoTire> getAllTire();
	public void addAutoTire(AutoTire autotire);
	public void updateAutoTire(AutoTire autotire);
	public void deleteAutoTireById(Integer autotireid);
	public Integer getAutoTireIdByName(String autotirename);
	
	/* User */
	public User getUser(String username);
	public void addAutoUser(User user);
	public void updateUser(User user);
	public void deleteUserById(Integer userid);

	/* Other */
	public String getReturnWork();
	public void sendMailPassword(String username);

}
