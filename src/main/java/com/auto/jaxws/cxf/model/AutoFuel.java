package com.auto.jaxws.cxf.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "autofuel", catalog = "carsalesdb", schema = "public")
public class AutoFuel implements Serializable  {

	private Integer autofueldid;
	private String autofuelname;
	
	
	protected AutoFuel() {
	}
	
	public AutoFuel(Integer autofueldid) {
		super();
		this.autofueldid = autofueldid;
	}

	public AutoFuel(Integer autofueldid, String autofuelname) {
		super();
		this.autofueldid = autofueldid;
		this.autofuelname = autofuelname;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "autofuelid", unique = true, nullable = false)	
	public Integer getAutofueldid() {
		return autofueldid;
	}
	public void setAutofueldid(Integer autofueldid) {
		this.autofueldid = autofueldid;
	}
	@Column(name = "autofuelname")
	public String getAutofuelname() {
		return autofuelname;
	}
	public void setAutofuelname(String autofuelname) {
		this.autofuelname = autofuelname;
	}

}
