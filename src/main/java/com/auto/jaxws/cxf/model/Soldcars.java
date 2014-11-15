package com.auto.jaxws.cxf.model;

// Generated Nov 16, 2014 1:40:49 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Soldcars generated by hbm2java
 */
@Entity
@Table(name = "soldcars", schema = "public")
public class Soldcars implements java.io.Serializable {

	private int soldcarid;
	private Customer customer;
	private Auto auto;

	public Soldcars() {
	}

	public Soldcars(int soldcarid) {
		this.soldcarid = soldcarid;
	}

	public Soldcars(int soldcarid, Customer customer, Auto auto) {
		this.soldcarid = soldcarid;
		this.customer = customer;
		this.auto = auto;
	}

	@Id
	@Column(name = "soldcarid", unique = true, nullable = false)
	public int getSoldcarid() {
		return this.soldcarid;
	}

	public void setSoldcarid(int soldcarid) {
		this.soldcarid = soldcarid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autoid")
	public Auto getAuto() {
		return this.auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

}
