package com.auto.jaxws.cxf.model;

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
@Table(name = "autocolor", catalog = "carsalesdb", schema = "public")
public class AutoColor implements Serializable {

	
	private static final long serialVersionUID = 4887484204968923927L;
	private Integer autocolorid;
	private String autocolorname;
	private Set<Auto> autos = new HashSet<Auto>(0);

	protected AutoColor() {

	}

	public AutoColor(Integer autocolorid) {
		super();
		this.autocolorid = autocolorid;
	}

	public AutoColor(Integer autocolorid, String autocolorname) {
		super();
		this.autocolorid = autocolorid;
		this.autocolorname= autocolorname;
	}

	public AutoColor(Integer autocolorid, String autocolorname,Set<Auto> autos) {
		super();
		this.autocolorid = autocolorid;
		this.autocolorname = autocolorname;
		this.autos = autos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autocolorid", unique = true, nullable = false)
	public Integer getAutocolorid() {
		return autocolorid;
	}

	public void setAutocolorid(Integer autocolorid) {
		this.autocolorid = autocolorid;
	}

	@Column(name = "autocolorname", nullable = false)
	public String getAutocolorname() {
		return autocolorname;
	}

	public void setAutocolorname(String autocolorname) {
		this.autocolorname = autocolorname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autocolor")
	@XmlTransient
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
