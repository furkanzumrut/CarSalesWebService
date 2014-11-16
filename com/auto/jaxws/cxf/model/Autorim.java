package com.auto.jaxws.cxf.model;

// Generated Oct 12, 2014 11:01:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

/**
 * Autorim generated by hbm2java
 */
public class Autorim implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int autorimid;
	private String autorimname;
	
	@JsonManagedReference
	private Set<Auto> autos = new HashSet<Auto>(0);

	public Autorim() {
	}

	public Autorim(int autorimid) {
		this.autorimid = autorimid;
	}

	public Autorim(int autorimid, String autorimname, Set<Auto> autos) {
		this.autorimid = autorimid;
		this.autorimname = autorimname;
		this.autos = autos;
	}

	public int getAutorimid() {
		return this.autorimid;
	}

	public void setAutorimid(int autorimid) {
		this.autorimid = autorimid;
	}

	public String getAutorimname() {
		return this.autorimname;
	}

	public void setAutorimname(String autorimname) {
		this.autorimname = autorimname;
	}

	public Set<Auto> getAutos() {
		return this.autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}