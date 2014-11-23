package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.AutoCategory;

import org.apache.cxf.annotations.GZIP;

/**
 * 
 * @author furkanzumrut.com
 *
 */
@GZIP
@WebService(targetNamespace = "http://webservice.autoservice", name = "AutoServiceWS")
public interface IAutoService {

	public void addAuto(Auto auto);

	public List<Auto> getAllAutos();
	
	public List<Auto> getAllAutosNames();
	
	public List<AutoCategory> getAllCategory();

	public Auto getAuto(Integer autoid);

	public String getReturnWork();

}
