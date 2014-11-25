package com.auto.jaxws.cxf.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.jaxws.cxf.dao.impl.AutoDao;
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
import com.auto.jaxws.cxf.utils.MailMail;

/**
 * 
 * @author furkanzumrut.com
 *
 */
@Service(value = "autoService")
public class AutoService implements IAutoService {

	private AutoDao autoDao;
	
	private MailMail mailMail;
	
	private User userObj;


	@Autowired
	public void setUserObj(User userObj) {
		this.userObj = userObj;
	}

	@Autowired
	public void setAutoDao(AutoDao autoDao) {
		this.autoDao = autoDao;
	}

	@Autowired
	public void setMailMail(MailMail mailMail) {
		this.mailMail = mailMail;
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
		return autoDao.selectAllCategory();
	}

	@Override
	public User getUser(String username) {
		return autoDao.findUserByName(username);
	}

	@Override
	public void sendMailPassword(String username) {
		userObj = autoDao.findUserByName(username);
		mailMail.sendMail("noreplycustomgarage@gmail.com", userObj.getMail(), "Your password", "Your password is "+userObj.getPassword());
		
	}





	@Override
	public List<AutoImage> getAllImageByAutoId(Integer autoid) {
		return autoDao.findImagesByAutoId(autoid);
	}

	@Override
	public void addAutoCategory(AutoCategory autocategory) {
		autoDao.AutoCategoryInsert(autocategory);
	}

	@Override
	public void addAutoSubCategory(AutoSubCategory autosubcategory) {
		autoDao.AutoSubCategoryInsert(autosubcategory);
		
	}

	@Override
	public void addAutoImage(AutoImage autoimage) {
		autoDao.AutoImageInsert(autoimage);
		
	}

	@Override
	public List<AutoFuel> getAllFuel() {
		return autoDao.selectAllFuel();
	}

	@Override
	public List<AutoGear> getAllGear() {
		return autoDao.selectAllGear();
	}

	@Override
	public List<AutoInterrior> getAllInterrior() {
		return autoDao.selectAllInterrior();
	}

	@Override
	public List<AutoRim> getAllAutoRim() {
		return autoDao.selectAllRim();
	}

	@Override
	public List<AutoTire> getAllTire() {
		return autoDao.selectAllTire();
	}

	@Override
	public void deleteAutoById(Integer autoid) {
		autoDao.deleteAuto(autoid);
	}

	@Override
<<<<<<< HEAD
	public List<AutoSubCategory> getAllSubCategoryByCategoryId(int categoryid) {
		return autoDao.selectAllSubCategorybyCategoryId(categoryid);
=======
	public List<AutoSubCategory> getAllSubCategory() {
		// TODO Auto-generated method stub
		return autoDao.selectAllSubCategory();
>>>>>>> parent of c6f1029... selectAllSubCategory method @Update
	}

	@Override
	public List<AutoSubCategory> getAllSubCategory() {
		return autoDao.selectAllSubCategory();
	}




}
