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
@Table(name = "autogear", catalog = "carsalesdb", schema = "public")
public class AutoGear  implements Serializable {
	

	private Integer autogearid;
	private String autogearname;
	private Set<Auto> autos = new HashSet<Auto>(0);
	
	protected AutoGear(){
		
	}
	
	
	public AutoGear(Integer autogearid) {
		super();
		this.autogearid = autogearid;
	}


	public AutoGear(Integer autogearid, String autogearname) {
		super();
		this.autogearid = autogearid;
		this.autogearname = autogearname;
	}


	public AutoGear(Integer autogearid, String autogearname, Set<Auto> autos) {
		super();
		this.autogearid = autogearid;
		this.autogearname = autogearname;
		this.autos = autos;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "autogearid", unique = true, nullable = false)		
	public Integer getAutogearid() {
		return autogearid;
	}
	public void setAutogearid(Integer autogearid) {
		this.autogearid = autogearid;
	}
	@Column(name = "autogearname")
	public String getAutogearname() {
		return autogearname;
	}
	public void setAutogearname(String autogearname) {
		this.autogearname = autogearname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autogear")
	@XmlTransient
	public Set<Auto> getAutos() {
		return autos;
	}


	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
