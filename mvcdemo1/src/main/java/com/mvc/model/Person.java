package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PERSON_DETAILS")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int personId;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	
	public int getpersonId() {
		return personId;
	}
	public void setpersonId(int id) {
		this.personId = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
