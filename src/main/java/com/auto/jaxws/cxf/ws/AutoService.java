package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.jaxws.cxf.dao.impl.AutoDao;
import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.utils.TokenChecker;

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
		// TODO Auto-generated method stub
		return autoDao.selectAll();
	}

	@Override
	public Auto getAuto(Integer autoid) {
		// TODO Auto-generated method stub

		return autoDao.findById(autoid);
	}

	@Override
	public String getReturnWork() {
		// TODO Auto-generated method stub

		return "It works!";
	}

	@Override
	public List<Auto> getAllAutosNames() {
		// TODO Auto-generated method stub
		return autoDao.selectAutosName();
	}

}
