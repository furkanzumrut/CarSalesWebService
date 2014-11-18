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
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "autointerrior", catalog = "carsalesdb", schema = "public")
public class AutoInterrior implements Serializable  {

	private Integer autointerriorid;
	private String autointerriorname;
	@Transient
	private Set<Auto> autos = new HashSet<Auto>(0);
	
	protected AutoInterrior() {
		
	}
	
	public AutoInterrior(Integer autointerriorid) {
		super();
		this.autointerriorid = autointerriorid;
	}

	public AutoInterrior(Integer autointerriorid, String autointerriorname) {
		super();
		this.autointerriorid = autointerriorid;
		this.autointerriorname = autointerriorname;
	}

	public AutoInterrior(Integer autointerriorid, String autointerriorname,
			Set<Auto> autos) {
		super();
		this.autointerriorid = autointerriorid;
		this.autointerriorname = autointerriorname;
		this.autos = autos;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "autointerriorid", unique = true, nullable = false)		
	public Integer getAutointerriorid() {
		return autointerriorid;
	}
	public void setAutointerriorid(Integer autointerriorid) {
		this.autointerriorid = autointerriorid;
	}
	@Column(name = "autointerriorname")
	public String getAutointerriorname() {
		return autointerriorname;
	}
	public void setAutointerriorname(String autointerriorname) {
		this.autointerriorname = autointerriorname;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autointerrior")
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
