package com.auto.jaxws.cxf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "autoimage", catalog = "carsalesdb", schema = "public")
public class AutoImage {
	private Integer autoimageid;
	private String autourl;
	private Auto auto;
	
	protected AutoImage(){
		
	}
	
	public AutoImage(Integer autoimageid, String autourl, Auto auto) {
		super();
		this.autoimageid = autoimageid;
		this.autourl = autourl;
		this.auto = auto;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "autoimageid", unique = true, nullable = false)
	public Integer getAutoimageid() {
		return autoimageid;
	}
	public void setAutoimageid(Integer autoimageid) {
		this.autoimageid = autoimageid;
	}
	@Column(name = "autourl")
	public String getAutourl() {
		return autourl;
	}
	public void setAutourl(String autourl) {
		this.autourl = autourl;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autoid", nullable = false)
	@JsonIgnore
	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

}
