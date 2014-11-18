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
@Table(name = "autogear", catalog = "carsalesdb", schema = "public")
public class AutoGear  implements Serializable {
	

	private Integer autogearid;
	private Integer autogearname;
	
	protected AutoGear(){
		
	}
	
	
	public AutoGear(Integer autogearid) {
		super();
		this.autogearid = autogearid;
	}


	public AutoGear(Integer autogearid, Integer autogearname) {
		super();
		this.autogearid = autogearid;
		this.autogearname = autogearname;
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
	public Integer getAutogearname() {
		return autogearname;
	}
	public void setAutogearname(Integer autogearname) {
		this.autogearname = autogearname;
	}

}
