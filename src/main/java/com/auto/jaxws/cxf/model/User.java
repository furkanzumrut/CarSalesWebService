package com.auto.jaxws.cxf.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", catalog = "carsalesdb", schema = "public")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2560464947681935909L;
	private Integer userid;
	private String username;
	private String namesurname;
	private String mail;
	private String password;

	protected User() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid", unique = true, nullable = false)
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "namesurname", nullable = false)
	public String getNamesurname() {
		return namesurname;
	}

	public void setNamesurname(String namesurname) {
		this.namesurname = namesurname;
	}

	@Column(name = "mail", nullable = false)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
