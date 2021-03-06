package com.auto.jaxws.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

// Generated Oct 12, 2014 11:01:48 PM by Hibernate Tools 3.4.0.CR1

/**
 * Autoimages generated by hbm2java
 */
public class Autoimages implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int autoimageid;
	
	@JsonManagedReference
	private Auto auto;
	
	private String autourl;

	public Autoimages() {
	}

	public Autoimages(int autoimageid) {
		this.autoimageid = autoimageid;
	}

	public Autoimages(int autoimageid, Auto auto, String autourl) {
		this.autoimageid = autoimageid;
		this.auto = auto;
		this.autourl = autourl;
	}

	public int getAutoimageid() {
		return this.autoimageid;
	}

	public void setAutoimageid(int autoimageid) {
		this.autoimageid = autoimageid;
	}

	public Auto getAuto() {
		return this.auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public String getAutourl() {
		return this.autourl;
	}

	public void setAutourl(String autourl) {
		this.autourl = autourl;
	}

}
