package com.auto.jaxws.cxf.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "autofuel", catalog = "carsalesdb", schema = "public")
public class AutoFuel implements Serializable  {

	private Integer autofueldid;
	private String autofuelname;
	@XmlTransient
	private Set<Auto> autos = new HashSet<Auto>(0);
	
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
	public AutoFuel(Integer autofueldid, String autofuelname, Set<Auto> autos) {
		super();
		this.autofueldid = autofueldid;
		this.autofuelname = autofuelname;
		this.autos = autos;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autofuel")
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
