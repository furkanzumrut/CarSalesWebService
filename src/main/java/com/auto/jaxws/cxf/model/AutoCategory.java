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

@Entity
@Table(name = "autocategory", catalog = "carsalesdb", schema = "public")
public class AutoCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1868883821477160731L;
	private Integer categoryid;
	private String categoryname;
	
	private Set<Auto> autos = new HashSet<Auto>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoryid", unique = true, nullable = false)
	public Integer getCategoryid() {
		return categoryid;
	}

	protected AutoCategory() {

	}



	public AutoCategory(Integer categoryid, String categoryname, Set<Auto> autos) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.autos = autos;
	}
	public AutoCategory(String categoryname) {
		super();

		this.categoryname = categoryname;

	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Column(name = "categoryname",nullable = false)
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autocategory")
	private Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
