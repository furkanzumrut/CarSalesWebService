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
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonIgnore;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "autocategory", catalog = "carsalesdb", schema = "public")
public class AutoCategory implements Serializable {

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

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Column(name = "categoryname")
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autocategory")
	@JsonIgnore
	public Set<Auto> getAutos() {
		return autos;
	}

	public void setAutos(Set<Auto> autos) {
		this.autos = autos;
	}

}
