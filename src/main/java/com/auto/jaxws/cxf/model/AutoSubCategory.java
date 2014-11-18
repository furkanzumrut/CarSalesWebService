package com.auto.jaxws.cxf.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "autosubcategory", catalog = "carsalesdb", schema = "public")
public class AutoSubCategory implements Serializable  {
	

	private Integer subcategoryid;
	private String subcategoryname;
	
	private AutoCategory autocategory;
	
	protected AutoSubCategory(){
		
	}
	
	public AutoSubCategory(Integer subcategoryid) {
		super();
		this.subcategoryid = subcategoryid;
	}

	public AutoSubCategory(Integer subcategoryid, String subcategoryname,
			AutoCategory autocategory) {
		super();
		this.subcategoryid = subcategoryid;
		this.subcategoryname = subcategoryname;
		this.autocategory = autocategory;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "subcategoryid", unique = true, nullable = false)
	public Integer getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(Integer subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	@Column(name = "subcategoryname")
	public String getSubcategoryname() {
		return subcategoryname;
	}
	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid")	
	public AutoCategory getAutocategory() {
		return autocategory;
	}
	public void setAutocategory(AutoCategory autocategory) {
		this.autocategory = autocategory;
	}

}
