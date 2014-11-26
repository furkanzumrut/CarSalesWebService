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
	public List<Auto> selectAll();
	public Auto findById(int id);
	public Integer findAutoByName(String autoname);
	public List<Auto> selectAutosName();
	public void deleteAuto(int id);
	public List<Auto> selectNotSoldAuto();
	/* AutoCategory */
	public List<AutoCategory> selectAllCategory();
	public void AutoCategoryInsert(AutoCategory autocategory);

	/* AutoSubCategory */
	public List<AutoSubCategory> selectAllSubCategory();
	public List<AutoSubCategory> selectAllSubCategorybyCategoryId(int categoryid);
	public void AutoSubCategoryInsert(AutoSubCategory autosubcategory);
	public Integer findAutoSubCategoryIdByName(String subcategoryname);
	
	/* AutoImage */
	public List<AutoImage> findImagesByAutoId(int id);
	public void AutoImageInsert(AutoImage autoimage);
	
	/* AutoFuel */
	public List<AutoFuel> selectAllFuel();
	
	/* AutoGear */
	public List<AutoGear> selectAllGear();
	
	/* AutoInterrior */
	public List<AutoInterrior> selectAllInterrior();
	
	/* AutoRim */
	public List<AutoRim> selectAllRim();
	
	/* AutoTire */
	public List<AutoTire> selectAllTire();
	
	/* User */
	public User findUserByName(String username);
	
	/* Search */
	
	

}
