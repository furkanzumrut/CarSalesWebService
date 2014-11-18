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
@Table(name = "autointerrior", catalog = "carsalesdb", schema = "public")
public class AutoInterrior implements Serializable  {

	private Integer autointerriorid;
	private Integer autointerriorname;
	
	protected AutoInterrior() {
		
	}
	
	public AutoInterrior(Integer autointerriorid) {
		super();
		this.autointerriorid = autointerriorid;
	}

	public AutoInterrior(Integer autointerriorid, Integer autointerriorname) {
		super();
		this.autointerriorid = autointerriorid;
		this.autointerriorname = autointerriorname;
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
	public Integer getAutointerriorname() {
		return autointerriorname;
	}
	public void setAutointerriorname(Integer autointerriorname) {
		this.autointerriorname = autointerriorname;
	}

}
