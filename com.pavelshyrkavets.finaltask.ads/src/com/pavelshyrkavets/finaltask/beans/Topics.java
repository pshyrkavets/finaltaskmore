package com.pavelshyrkavets.finaltask.beans;

public class Topics {
	
	private int t_id;
	private String t_name;
	
	public Topics() {}
	 
	public Topics(int t_id, String t_name) {
		this.t_id = t_id;
		this.t_name = t_name;
	}
	
	public int getTId() {
		return t_id;
	}
	
	public void setTId(int t_id) {
		this.t_id = t_id;
	}
	 
	public String getTName() {
		return t_name;
	}
	 
	public void setTName(String t_name) {
		this.t_name = t_name;
	}
}
