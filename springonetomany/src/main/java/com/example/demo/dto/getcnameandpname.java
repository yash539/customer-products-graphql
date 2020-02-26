package com.example.demo.dto;

public class getcnameandpname {
private String name;
private String pname;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "getcnameandpname [name=" + name + ", pname=" + pname +  "]";
}
public getcnameandpname(String name, String pname) {
	super();
	this.name = name;
	this.pname = pname;
	
}
public getcnameandpname() {
	super();
}



}
