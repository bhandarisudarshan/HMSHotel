package com.cap.hms;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="contact")
public class contact {
	
	private String firstname;
	private String lastname;
	private String email;
	private long phone;
	private String message;
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public contact(String firstname, String lastname, String email, long phone, String message) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.message = message;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
