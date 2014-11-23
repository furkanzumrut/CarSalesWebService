package com.auto.jaxws.cxf.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer", catalog = "carsalesdb", schema = "public")
public class Customer implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 448442314618323115L;
	private Integer customerid;
	private String customername;
	private String customerphone;
	private Integer customergender;
	private String customeradress;
	private Date customerregisterdate;

	
	protected Customer(){
		
	}
	
	public Customer(Integer customerid) {
		super();
		this.customerid = customerid;
	}
	
	public Customer(Integer customerid, String customername,
			String customerphone, Integer customergender,
			String customeradress, Date customerregisterdate) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerphone = customerphone;
		this.customergender = customergender;
		this.customeradress = customeradress;
		this.customerregisterdate = customerregisterdate;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "customerid", unique = true, nullable = false)	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	@Column(name= "customername", nullable = false)
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Column(name= "customerphone", nullable = false)
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	@Column(name= "customergender", nullable = false)
	public Integer getCustomergender() {
		return customergender;
	}
	public void setCustomergender(Integer customergender) {
		this.customergender = customergender;
	}
	@Column(name= "customeradress", nullable = false)
	public String getCustomeradress() {
		return customeradress;
	}
	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}
	@Temporal(TemporalType.DATE)
	@Column(name= "customerregisterdate", nullable = false)
	public Date getCustomerregisterdate() {
		return customerregisterdate;
	}
	public void setCustomerregisterdate(Date customerregisterdate) {
		this.customerregisterdate = customerregisterdate;
	}



}
