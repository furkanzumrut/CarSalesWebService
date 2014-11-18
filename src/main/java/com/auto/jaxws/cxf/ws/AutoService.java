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
	public void addAutoWithToken(Auto auto, String token, String username, String password) {
		if(new TokenChecker().Check(username, password, token))
		autoDao.insert(auto);
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
	public Auto getAuto(String autoid) {
		// TODO Auto-generated method stub
		
		return autoDao.findById(Integer.parseInt(autoid));
	}




	@Override
	public String getHome(String id) {
		// TODO Auto-generated method stub
		
		return id;
	}


	@Override
	public String getToken(String username, String password) {
		// TODO Auto-generated method stub
		return new TokenChecker().getToken(username, password);
	}





}
