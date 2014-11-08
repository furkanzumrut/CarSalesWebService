package com.auto.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.auto.jaxws.cxf.model.Auto;
import com.auto.jaxws.cxf.model.Autocategory;

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
@Consumes("application/json")
@Produces("application/json")
public interface IAutoService {

	@POST
	@Path("/addAuto")
	public void addAutoWithToken(Auto auto, @HeaderParam("auth-token") String token, @HeaderParam("auth-user") String username, @HeaderParam("auth-password") String password);
	
	
	@POST
	@Path("/getToken")
	public String getToken(@HeaderParam("auth-user") String username, @HeaderParam("auth-password") String password);
	
	public void addAuto(Auto auto);
	public List<Auto> getAllAutos();
	
	public List<Autocategory> getAllAutoCategory();
	
	@GET
	@Path("/getAutoById/{autoid}")
	public Auto getAuto(@PathParam("autoid") String autoid);
	
	
	@GET
	@Path("/get/{id}")
	public String getHome(@PathParam("id") String id);



}
