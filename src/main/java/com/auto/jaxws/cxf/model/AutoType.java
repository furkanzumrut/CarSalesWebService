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
@Table(name = "autotype", catalog = "carsalesdb", schema = "public")
public class AutoType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7722522951838666147L;
	/**
	 * 
	 */
	
	private Integer autotypeid;
	private String autotypename;
	private Set<Auto> autos = new HashSet<Auto>(0);

	protected AutoType() {

	}

	public AutoType(Integer autotypeid) {
		super();
		this.autotypeid = autotypeid;
	}

	public AutoType(Integer autotypeid, String autotypename) {
		super();
		this.autotypeid = autotypeid;
		this.autotypename= autotypename;
	}

	public AutoType(Integer autotypeid, String autotypename, Set<Auto> autos) {
		super();
		this.autotypeid = autotypeid;
		this.autotypename = autotypename;
		this.autos = autos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autotypeid", unique = true, nullable = false)
	public Integer getAutotypeid() {
		return autotypeid;
	}

	public void setAutotypeid(Integer autotypeid) {
		this.autotypeid = autotypeid;
	}

	@Column(name = "autotypename", nullable = false)
	public String getAutotypename() {
		return autotypename;
	}

	public void setAutotypename(String autotypename) {
		this.autotypename = autotypename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autotype")
	@XmlTransient
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
