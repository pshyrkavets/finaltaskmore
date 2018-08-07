package com.pavelshyrkavets.finaltask.beans;

public class Clients {
	
	private int c_id;
	private String c_name;
	private String c_email;
	private String c_telnum;
	 
	public Clients() {}
	 
	public Clients(int c_id, String c_name, String c_email, String c_telnum) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_telnum = c_telnum;
	}
	
	public int getCId() {
		return c_id;
	}
	
	public void setCId(int c_id) {
		this.c_id = c_id;
	}
	 
	public String getCName() {
		return c_name;
	}
	 
	public void setCName(String c_name) {
		this.c_name = c_name;
	}
	 
	public String getCEmail() {
		return c_email;
	}
	 
	public void setCEmail(String c_email) {
		this.c_email = c_email;
	}
	
	public String getCTelNum() {
		return c_telnum;
	}
	 
	public void setCTelNum(String c_telnum) {
		this.c_telnum = c_telnum;
	}
}
