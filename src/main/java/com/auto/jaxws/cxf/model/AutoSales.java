package com.auto.jaxws.cxf.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "autosales", catalog = "carsalesdb", schema = "public")
public class AutoSales  implements Serializable {
	
	private Integer autoid;
	private Auto auto;
	private Customer customer;
	private Integer sold;

	protected AutoSales(){
		
	}
	
	public AutoSales(Integer autoid) {
		super();
		this.autoid = autoid;
	}

	public AutoSales(Integer autoid, Auto auto, Customer customer, Integer sold) {
		super();
		this.autoid = autoid;
		this.auto = auto;
		this.customer = customer;
		this.sold = sold;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid", nullable = false)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Column(name = "sold")
	public Integer getSold() {
		return sold;
	}
	public void setSold(Integer sold) {
		this.sold = sold;
	}
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "auto"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "autoid", unique = true, nullable = false)	
	public Integer getAutoid() {
		return autoid;
	}
	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	//Added
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
}
