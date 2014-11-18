package com.auto.jaxws.cxf.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autotire", catalog = "carsalesdb", schema = "public")
public class AutoTire implements Serializable  {

	private Integer autotireid;
	private String autotirename;
	
	protected AutoTire(){
		
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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "autotireid", unique = true, nullable = false)	
	public Integer getAutotireid() {
		return autotireid;
	}
	public void setAutotireid(Integer autotireid) {
		this.autotireid = autotireid;
	}
	@Column(name= "autotirename")
	public String getAutotirename() {
		return autotirename;
	}
	public void setAutotirename(String autotirename) {
		this.autotirename = autotirename;
	}

}
