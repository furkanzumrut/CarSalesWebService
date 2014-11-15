package com.auto.jaxws.cxf.model;

// Generated Nov 16, 2014 1:40:49 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Autorim generated by hbm2java
 */
@Entity
@Table(name = "autorim", schema = "public")
public class Autorim implements java.io.Serializable {

	private int autorimid;
	private String autorimname;
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

	@Id
	@Column(name = "autorimid", unique = true, nullable = false)
	public int getAutorimid() {
		return this.autorimid;
	}

	public void setAutorimid(int autorimid) {
		this.autorimid = autorimid;
	}

	@Column(name = "autorimname")
	public String getAutorimname() {
		return this.autorimname;
	}

	public void setAutorimname(String autorimname) {
		this.autorimname = autorimname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autorim")
	public Set<Auto> getAutos() {
		return this.autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
