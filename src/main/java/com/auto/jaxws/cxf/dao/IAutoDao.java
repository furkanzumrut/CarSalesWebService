package com.auto.jaxws.cxf.dao;

import java.util.List;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;
import com.auto.jaxws.cxf.model.AutoSubCategory;
import com.auto.jaxws.cxf.model.User;


/**
 * 
 * @author furkanzumrut.com
 *
 */
public interface IAutoDao {

	public void insert(Auto auto);

	public List<Auto> selectAll();
	
	public List<AutoCategory> selectAllCategory();
	
	public List<AutoSubCategory> selectAllSubCategory();
	
	public Auto findById(int id);

	public List<Auto> selectAutosName();
	
	public User findUserByName(String username);


}
