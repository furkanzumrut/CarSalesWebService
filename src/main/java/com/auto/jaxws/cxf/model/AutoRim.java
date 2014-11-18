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
@Table(name = "autorim", catalog = "carsalesdb", schema = "public")
public class AutoRim  implements Serializable {

	private Integer autorimid;
	private String autorimname;
	
	protected AutoRim(){
		
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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
}
