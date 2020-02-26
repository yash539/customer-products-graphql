package com.example.demo.dto;

public class customerbyproductid {

	private int pid;
	private String cname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "customerbyproductid [pid=" + pid + ", cname=" + cname + "]";
	}
	public customerbyproductid(int pid, String cname) {
		super();
		this.pid = pid;
		this.cname = cname;
	}
	public customerbyproductid() {
		super();
	}
	
	
	
}
