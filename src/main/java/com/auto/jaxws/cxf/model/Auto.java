package com.auto.jaxws.cxf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "auto", catalog = "carsalesdb", schema = "public")
public class Auto implements Serializable {

	private Integer autoid;
	private String autoname;
	private Integer automodel;
	private Double auto100km;
	private Integer autocolor;
	private Integer autokm;
	private Integer autohp;
	private Integer autohand;
	private Date autoregisterdate;
	private Integer autotype;
	private Double autoprice;
	// private AutoSales autosaless;
	private AutoCategory autocategory;

	protected Auto() {
	}

	public Auto(Integer autoid) {
		super();
		this.autoid = autoid;
	}

	public Auto(Integer autoid, String autoname, Integer automodel,
			Double auto100km, Integer autocolor, Integer autokm,
			Integer autohp, Integer autohand, Date autoregisterdate,
			Integer autotype, Double autoprice, AutoCategory autocategory) {
		super();
		this.autoid = autoid;
		this.autoname = autoname;
		this.automodel = automodel;
		this.auto100km = auto100km;
		this.autocolor = autocolor;
		this.autokm = autokm;
		this.autohp = autohp;
		this.autohand = autohand;
		this.autoregisterdate = autoregisterdate;
		this.autotype = autotype;
		this.autoprice = autoprice;
		this.autocategory = autocategory;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "autoid", unique = true, nullable = false)
	public Integer getAutoid() {
		return autoid;
	}

	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}

	@Column(name = "autoname")
	public String getAutoname() {
		return autoname;
	}

	public void setAutoname(String autoname) {
		this.autoname = autoname;
	}

	@Column(name = "automodel")
	public Integer getAutomodel() {
		return automodel;
	}

	public void setAutomodel(Integer automodel) {
		this.automodel = automodel;
	}

	@Column(name = "auto100km")
	public Double getAuto100km() {
		return auto100km;
	}

	public void setAuto100km(Double auto100km) {
		this.auto100km = auto100km;
	}

	@Column(name = "autocolor")
	public Integer getAutocolor() {
		return autocolor;
	}

	public void setAutocolor(Integer autocolor) {
		this.autocolor = autocolor;
	}

	@Column(name = "autokm")
	public Integer getAutokm() {
		return autokm;
	}

	public void setAutokm(Integer autokm) {
		this.autokm = autokm;
	}

	@Column(name = "autohp")
	public Integer getAutohp() {
		return autohp;
	}

	public void setAutohp(Integer autohp) {
		this.autohp = autohp;
	}

	@Column(name = "autohand")
	public Integer getAutohand() {
		return autohand;
	}

	public void setAutohand(Integer autohand) {
		this.autohand = autohand;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "autoregisterdate")
	public Date getAutoregisterdate() {
		return autoregisterdate;
	}

	public void setAutoregisterdate(Date autoregisterdate) {
		this.autoregisterdate = autoregisterdate;
	}

	@Column(name = "autotype")
	public Integer getAutotype() {
		return autotype;
	}

	public void setAutotype(Integer autotype) {
		this.autotype = autotype;
	}

	@Column(name = "autoprice")
	public Double getAutoprice() {
		return autoprice;
	}

	public void setAutoprice(Double autoprice) {
		this.autoprice = autoprice;
	}

	// @OneToOne(fetch = FetchType.LAZY, mappedBy = "autosales", cascade =
	// CascadeType.ALL)
	// public AutoSales getAutosaless() {
	// return autosaless;
	// }
	//
	//
	// public void setAutosaless(AutoSales autosaless) {
	// this.autosaless = autosaless;
	// }

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid", nullable = false)
	public AutoCategory getAutocategory() {
		return autocategory;
	}

	public void setAutocategory(AutoCategory autocategory) {
		this.autocategory = autocategory;
	}

}
