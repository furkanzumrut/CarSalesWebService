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

@Entity
@Table(name = "auto", catalog = "carsalesdb", schema = "public")
public class Auto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1757842871351737590L;
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
	private AutoSales autosales;
	private AutoCategory autocategory;
	private AutoFuel autofuel;
	private AutoGear autogear;
	private AutoInterrior autointerrior;
	private AutoRim autorim;
	private AutoSubCategory autosubcategory;
	private AutoTire autotire;
	private Set<AutoImage> autoimages = new HashSet<AutoImage>(
			0);
	
	protected Auto() {
	}

	
	public Auto(String autoname, Integer automodel, Double auto100km,
			Integer autocolor, Integer autokm, Integer autohp,
			Integer autohand, Date autoregisterdate, Integer autotype,
			Double autoprice) {
		super();
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
	}


	public Auto(String autoname, Integer automodel, Double auto100km,
			Integer autocolor, Integer autokm, Integer autohp,
			Integer autohand, Date autoregisterdate, Integer autotype,
			Double autoprice, AutoSales autosales, AutoCategory autocategory,
			AutoFuel autofuel, AutoGear autogear, AutoInterrior autointerrior,
			AutoRim autorim, AutoSubCategory autosubcategory,
			AutoTire autotire, Set<AutoImage> autoimages) {
		super();
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
		this.autosales = autosales;
		this.autocategory = autocategory;
		this.autofuel = autofuel;
		this.autogear = autogear;
		this.autointerrior = autointerrior;
		this.autorim = autorim;
		this.autosubcategory = autosubcategory;
		this.autotire = autotire;
		this.autoimages = autoimages;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autoid", unique = true, nullable = false)
	public Integer getAutoid() {
		return autoid;
	}

	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}

	@Column(name = "autoname", nullable = false)
	public String getAutoname() {
		return autoname;
	}

	public void setAutoname(String autoname) {
		this.autoname = autoname;
	}

	@Column(name = "automodel", nullable = false)
	public Integer getAutomodel() {
		return automodel;
	}

	public void setAutomodel(Integer automodel) {
		this.automodel = automodel;
	}

	@Column(name = "auto100km", nullable = false)
	public Double getAuto100km() {
		return auto100km;
	}

	public void setAuto100km(Double auto100km) {
		this.auto100km = auto100km;
	}

	@Column(name = "autocolor", nullable = false)
	public Integer getAutocolor() {
		return autocolor;
	}

	public void setAutocolor(Integer autocolor) {
		this.autocolor = autocolor;
	}

	@Column(name = "autokm", nullable = false)
	public Integer getAutokm() {
		return autokm;
	}

	public void setAutokm(Integer autokm) {
		this.autokm = autokm;
	}

	@Column(name = "autohp", nullable = false)
	public Integer getAutohp() {
		return autohp;
	}

	public void setAutohp(Integer autohp) {
		this.autohp = autohp;
	}

	@Column(name = "autohand", nullable = false)
	public Integer getAutohand() {
		return autohand;
	}

	public void setAutohand(Integer autohand) {
		this.autohand = autohand;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "autoregisterdate", nullable = false)
	public Date getAutoregisterdate() {
		return autoregisterdate;
	}

	public void setAutoregisterdate(Date autoregisterdate) {
		this.autoregisterdate = autoregisterdate;
	}

	@Column(name = "autotype",nullable = false)
	public Integer getAutotype() {
		return autotype;
	}

	public void setAutotype(Integer autotype) {
		this.autotype = autotype;
	}

	@Column(name = "autoprice",nullable = false)
	public Double getAutoprice() {
		return autoprice;
	}

	public void setAutoprice(Double autoprice) {
		this.autoprice = autoprice;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "auto", cascade = CascadeType.ALL)
	public AutoSales getAutosales() {
		return autosales;
	}

	public void setAutosales(AutoSales autosales) {
		this.autosales = autosales;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid", nullable = false)
	public AutoCategory getAutocategory() {
		return autocategory;
	}

	public void setAutocategory(AutoCategory autocategory) {
		this.autocategory = autocategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autofuelid", nullable = false)
	public AutoFuel getAutofuel() {
		return autofuel;
	}

	public void setAutofuel(AutoFuel autofuel) {
		this.autofuel = autofuel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autogearid", nullable = false)
	public AutoGear getAutogear() {
		return autogear;
	}

	public void setAutogear(AutoGear autogear) {
		this.autogear = autogear;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autointerriorid", nullable = false)
	public AutoInterrior getAutointerrior() {
		return autointerrior;
	}

	public void setAutointerrior(AutoInterrior autointerrior) {
		this.autointerrior = autointerrior;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autorimid", nullable = false)
	public AutoRim getAutorim() {
		return autorim;
	}

	public void setAutorim(AutoRim autorim) {
		this.autorim = autorim;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subcategoryid", nullable = false)
	public AutoSubCategory getAutosubcategory() {
		return autosubcategory;
	}

	public void setAutosubcategory(AutoSubCategory autosubcategory) {
		this.autosubcategory = autosubcategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autotireid", nullable = false)
	public AutoTire getAutotire() {
		return autotire;
	}

	public void setAutotire(AutoTire autotire) {
		this.autotire = autotire;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "auto")
	public Set<AutoImage> getAutoimages() {
		return autoimages;
	}

	public void setAutoimages(Set<AutoImage> autoimages) {
		this.autoimages = autoimages;
	}

}
