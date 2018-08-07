package com.pavelshyrkavets.finaltask.beans;

public class Admins {
	
	private int a_id;
	private String a_name;
	private String a_email;
	private String a_telnum;
	 
	public Admins() {}
	 
	public Admins(int a_id, String a_name, String a_email, String a_telnum) {
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_email = a_email;
		this.a_telnum = a_telnum;
	}
	
	public int getAId() {
		return a_id;
	}
	
	public void setAId(int a_id) {
		this.a_id = a_id;
	}
	 
	public String getAName() {
		return a_name;
	}
	 
	public void setAName(String a_name) {
		this.a_name = a_name;
	}
	 
	public String getAEmail() {
		return a_email;
	}
	 
	public void setAEmail(String a_email) {
		this.a_email = a_email;
	}
	
	public String getATelNum() {
		return a_telnum;
	}
	 
	public void setATelNum(String a_telnum) {
		this.a_telnum = a_telnum;
	}
}
