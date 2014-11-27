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
	public List<AutoSubCategory> getAllSubCategoryByCategoryId(int categoryid) {
		return autoDao.selectAllSubCategorybyCategoryId(categoryid);
	}

	@Override
	public List<AutoSubCategory> getAllSubCategory() {
		return autoDao.selectAllSubCategory();
	}

	@Override
	public List<Auto> getNotSoldAutos() {
		// TODO Auto-generated method stub
		return autoDao.selectNotSoldAuto();
	}

	@Override
	public Integer getAutoSubCategoryIdByName(String subcategoryname) {
		// TODO Auto-generated method stub
		return autoDao.findAutoSubCategoryIdByName(subcategoryname);
	}

	@Override
	public Integer getAutoIdByName(String autoname) {
		// TODO Auto-generated method stub
		return autoDao.findAutoByName(autoname);
	}

	@Override
	public void addAutoImage2(int autoimageid, String autourl, int autoid) {
		autoDao.AutoImageInsert2(autoimageid, autourl, autoid);
	}

	@Override
	public void updateAuto(Auto auto) {
		autoDao.update(auto);
		
	}

	@Override
	public void addAutoFuel(AutoFuel autofuel) {
		autoDao.AutoFuelInsert(autofuel);
		
	}

	@Override
	public void addAutoGear(AutoGear autogear) {
		autoDao.AutoGearInsert(autogear);
		
	}

	@Override
	public void addAutoInterrior(AutoInterrior autointerrior) {
		autoDao.AutoInterriorInsert(autointerrior);
		
	}

	@Override
	public void addAutoRim(AutoRim autorim) {
		autoDao.AutoRimInsert(autorim);
		
	}

	@Override
	public void addAutoTire(AutoTire autotire) {
		autoDao.AutoTireInsert(autotire);
		
	}

	@Override
	public void addAutoUser(User user) {
		autoDao.UserInsert(user);
		
	}

	@Override
	public void updateAutoCategory(AutoCategory autocategory) {
		autoDao.AutoCategoryUpdate(autocategory);
		
	}

	@Override
	public void deleteAutoCategoryById(Integer autocategoryid) {
		autoDao.deleteAutoCategory(autocategoryid);
		
	}

	@Override
	public void updateAutoSubCategory(AutoSubCategory autosubcategory) {
		autoDao.AutoSubCategoryUpdate(autosubcategory);
		
	}

	@Override
	public void deleteAutoSubCategoryById(Integer autosubcategoryid) {
		autoDao.deleteAutoSubCategory(autosubcategoryid);
		
	}

	@Override
	public void updateAutoFuel(AutoFuel autofuel) {
		autoDao.AutoFuelUpdate(autofuel);
		
	}

	@Override
	public void deleteAutoFuelById(Integer autofuelid) {
		autoDao.deleteAutoFuel(autofuelid);
		
	}

	@Override
	public void updateAutoGear(AutoGear autogear) {
		autoDao.AutoGearUpdate(autogear);
		
	}

	@Override
	public void deleteAutoGearById(Integer autogearid) {
		autoDao.deleteAutoGear(autogearid);
		
	}

	@Override
	public void updateAutoInterrior(AutoInterrior autointerrior) {
		autoDao.AutoInterriorUpdate(autointerrior);
		
	}

	@Override
	public void deleteAutoInterriorById(Integer autointerriorid) {
		autoDao.deleteAutoInterrior(autointerriorid);
		
	}

	@Override
	public void updateAutoRim(AutoRim autorim) {
		autoDao.AutoRimUpdate(autorim);
		
	}

	@Override
	public void deleteAutoRimById(Integer autorimid) {
		autoDao.deleteAutoRim(autorimid);
		
	}

	@Override
	public void updateAutoTire(AutoTire autotire) {
		autoDao.AutoTireUpdate(autotire);
		
	}

	@Override
	public void deleteAutoTireById(Integer autotireid) {
		autoDao.deleteAutoTire(autotireid);
		
	}

	@Override
	public void updateUser(User user) {
		autoDao.UserUpdate(user);
		
	}

	@Override
	public void deleteUserById(Integer userid) {
		autoDao.deleteUser(userid);
		
	}

	@Override
	public Integer getAutoCategoryIdByName(String autocategoryname) {
		return autoDao.findAutoCategoryIdByName(autocategoryname);
	}

	@Override
	public Integer getAutoTireIdByName(String autotirename) {
		// TODO Auto-generated method stub
		return autoDao.findAutoTireIdByName(autotirename);
	}

	@Override
	public Integer getAutoRimIdByName(String autorimname) {
		// TODO Auto-generated method stub
		return autoDao.findAutoRimIdByName(autorimname);
	}

	@Override
	public Integer getAutoFuelIdByName(String autofuelname) {
		// TODO Auto-generated method stub
		return autoDao.findAutoFuelIdByName(autofuelname);
	}




}
