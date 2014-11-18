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
@Table(name = "autorim", catalog = "carsalesdb", schema = "public")
public class AutoRim implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4546184216262816777L;
	private Integer autorimid;
	private String autorimname;
	private Set<Auto> autos = new HashSet<Auto>(0);

	protected AutoRim() {

	}

	public AutoRim(Integer autorimid) {
		super();
		this.autorimid = autorimid;
	}

	public AutoRim(Integer autorimid, String autorimname) {
		super();
		this.autorimid = autorimid;
		this.autorimname = autorimname;
	}

	public AutoRim(Integer autorimid, String autorimname, Set<Auto> autos) {
		super();
		this.autorimid = autorimid;
		this.autorimname = autorimname;
		this.autos = autos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autorimid", unique = true, nullable = false)
	public Integer getAutorimid() {
		return autorimid;
	}

	public void setAutorimid(Integer autorimid) {
		this.autorimid = autorimid;
	}

	@Column(name = "autorimname")
	public String getAutorimname() {
		return autorimname;
	}

	public void setAutorimname(String autorimname) {
		this.autorimname = autorimname;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autorim")
	@XmlTransient
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}
}
