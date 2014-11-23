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
@Table(name = "autogear", catalog = "carsalesdb", schema = "public")
public class AutoGear  implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8433470193716532468L;
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
	@Column(name = "autogearname", nullable = false)
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
