package com.auto.jaxws.cxf.dao;

import java.util.List;

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
public interface IAutoDao {

	/* Auto */
	public void insert(Auto auto);
	public void update(Auto auto);
	public List<Auto> selectAll();
	public Auto findById(int id);
	public Integer findAutoByName(String autoname);
	public List<Auto> selectAutosName();
	public void deleteAuto(int id);
	public List<Auto> selectNotSoldAuto();
	
	/* AutoCategory */
	public List<AutoCategory> selectAllCategory();
	public void AutoCategoryInsert(AutoCategory autocategory);
	public void AutoCategoryUpdate(AutoCategory autocategory);
	public void deleteAutoCategory(int autocategoryid);
	public Integer findAutoCategoryIdByName(String autocategoryname);
	
	/* AutoSubCategory */
	public List<AutoSubCategory> selectAllSubCategory();
	public List<AutoSubCategory> selectAllSubCategorybyCategoryId(int categoryid);
	public void AutoSubCategoryInsert(AutoSubCategory autosubcategory);
	public Integer findAutoSubCategoryIdByName(String subcategoryname);
	public void AutoSubCategoryUpdate(AutoSubCategory autosubcategory);
	public void deleteAutoSubCategory(int autosubcategoryid);
	
	/* AutoImage */
	public List<AutoImage> findImagesByAutoId(int id);
	public void AutoImageInsert(AutoImage autoimage);
	public void AutoImageInsert2(int autoimageid,String autourl, int autoid);
	
	
	/* AutoFuel */
	public List<AutoFuel> selectAllFuel();
	public void AutoFuelInsert(AutoFuel autofuel);
	public void AutoFuelUpdate(AutoFuel autofuel);
	public void deleteAutoFuel(int autofuelid);
	
	/* AutoGear */
	public List<AutoGear> selectAllGear();
	public void AutoGearInsert(AutoGear autogear);
	public void AutoGearUpdate(AutoGear autogear);
	public void deleteAutoGear(int autogearid);
	
	/* AutoInterrior */
	public List<AutoInterrior> selectAllInterrior();
	public void AutoInterriorInsert(AutoInterrior autointerrior);
	public void AutoInterriorUpdate(AutoInterrior autointerrior);
	public void deleteAutoInterrior(int autointerriorid);
	
	/* AutoRim */
	public List<AutoRim> selectAllRim();
	public void AutoRimInsert(AutoRim autorim);
	public void AutoRimUpdate(AutoRim autorim);
	public void deleteAutoRim(int autorimid);
	public Integer findAutoRimIdByName(String autorimname);
	
	/* AutoTire */
	public List<AutoTire> selectAllTire();
	public void AutoTireInsert(AutoTire autotire);
	public void AutoTireUpdate(AutoTire autotire);
	public void deleteAutoTire(int autotireid);
	public Integer findAutoTireIdByName(String autotirename);
	
	/* User */
	public User findUserByName(String username);
	public void UserInsert(User user);
	public void UserUpdate(User user);
	public void deleteUser(int userid);
	
	/* Search */
	
	

}
