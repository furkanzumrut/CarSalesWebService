package com.auto.jaxws.cxf.dao;

import java.util.List;

import com.auto.jaxws.cxf.model.Auto;


/**
 * 
 * @author furkanzumrut.com
 *
 */
public interface IAutoDao {

	public void insert(Auto auto);

	public List<Auto> selectAll();
	
	public Auto findById(int id);

	public List<Auto> selectAutosName();


}
