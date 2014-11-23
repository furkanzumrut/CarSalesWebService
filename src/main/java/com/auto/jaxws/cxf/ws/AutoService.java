package com.auto.jaxws.cxf.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.jaxws.cxf.dao.impl.AutoDao;
import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;

/**
 * 
 * @author furkanzumrut.com
 *
 */
@Service(value = "autoService")
public class AutoService implements IAutoService {

	private AutoDao autoDao;

	@Autowired
	public void setAutoDao(AutoDao autoDao) {
		this.autoDao = autoDao;
	}

	@Override
	public void addAuto(Auto auto) {

		autoDao.insert(auto);
	}

	@Override
	public List<Auto> getAllAutos() {
		// 
		return autoDao.selectAll();
	}

	@Override
	public Auto getAuto(Integer autoid) {
		//

		return autoDao.findById(autoid);
	}

	@Override
	public String getReturnWork() {
		// 

		return "It works!";
	}

	@Override
	public List<Auto> getAllAutosNames() {
		// 
		return autoDao.selectAutosName();
	}

	@Override
	public List<AutoCategory> getAllCategory() {
		// TODO Auto-generated method stub
		return autoDao.selectAllCategory();
	}

}
