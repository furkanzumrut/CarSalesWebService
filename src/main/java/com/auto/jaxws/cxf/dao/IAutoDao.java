package com.auto.jaxws.cxf.dao;

import java.util.List;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;
import com.auto.jaxws.cxf.model.AutoImage;
import com.auto.jaxws.cxf.model.AutoSubCategory;
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
	public List<Auto> selectAutosName();

	/* AutoCategory */
	public List<AutoCategory> selectAllCategory();
	public void AutoCategoryInsert(AutoCategory autocategory);

	/* AutoSubCategory */
	public List<AutoSubCategory> selectAllSubCategory();
	public void AutoSubCategoryInsert(AutoSubCategory autosubcategory);
	
	/* AutoImage */
	public List<AutoImage> findImagesByAutoId(int id);
	public void AutoImageInsert(AutoImage autoimage);
	
	/* User */
	public User findUserByName(String username);

}
