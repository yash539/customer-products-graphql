package com.example.demo.dto;

public class Customerdetailsdto {

	private String name;
	private String email;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customerdetailsdto [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	public Customerdetailsdto(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Customerdetailsdto() {
		super();
	}
	
}
