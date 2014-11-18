package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.auto.jaxws.cxf.model.Auto;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.cxf.annotations.GZIP;

/**
 * 
 * @author furkanzumrut.com
 *
 */
@GZIP
@WebService
public interface IAutoService {



	public void addAuto(Auto auto);

	public List<Auto> getAllAutos();

	public Auto getAuto(@PathParam("autoid") String autoid);

	public String getHome(@PathParam("id") String id);

}
