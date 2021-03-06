package com.youtube.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends ParentEntity{


	private static final long serialVersionUID = 8435405591663518471L;
	
	
	
	
	@Column(name = "" , nullable=false , length=255)
	private String firstname ;
	
	@Column(name = "" , nullable=true , length=255)
	private String  secondname;
	
	@Column(name = "" , nullable=false, length=255)
	private String firstsurname ;
	
	@Column(name = "" , nullable=true, length=255)
	private String 	 secondsurname ;
	
	@Column(name = "" , nullable=true , length=255)
	private String phone ;
	
	@Column(name = "" , nullable=false , length=255)
	private String addres ;

	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getFirstsurname() {
		return firstsurname;
	}

	public void setFirstsurname(String firstsurname) {
		this.firstsurname = firstsurname;
	}

	public String getSecondsurname() {
		return secondsurname;
	}

	public void setSecondsurname(String secondsurname) {
		this.secondsurname = secondsurname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}
    

}
