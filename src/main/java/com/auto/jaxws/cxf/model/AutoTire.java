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
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "autotire", catalog = "carsalesdb", schema = "public")
public class AutoTire implements Serializable {

	private Integer autotireid;
	private String autotirename;
	private Set<Auto> autos = new HashSet<Auto>(0);

	protected AutoTire() {

	}

	public AutoTire(Integer autotireid) {
		super();
		this.autotireid = autotireid;
	}

	public AutoTire(Integer autotireid, String autotirename) {
		super();
		this.autotireid = autotireid;
		this.autotirename = autotirename;
	}

	public AutoTire(Integer autotireid, String autotirename, Set<Auto> autos) {
		super();
		this.autotireid = autotireid;
		this.autotirename = autotirename;
		this.autos = autos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autotireid", unique = true, nullable = false)
	public Integer getAutotireid() {
		return autotireid;
	}

	public void setAutotireid(Integer autotireid) {
		this.autotireid = autotireid;
	}

	@Column(name = "autotirename")
	public String getAutotirename() {
		return autotirename;
	}

	public void setAutotirename(String autotirename) {
		this.autotirename = autotirename;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autotire")
	@XmlTransient
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
