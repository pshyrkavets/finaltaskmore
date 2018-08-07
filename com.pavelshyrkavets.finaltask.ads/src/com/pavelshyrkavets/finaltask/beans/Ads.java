package com.pavelshyrkavets.finaltask.beans;

public class Ads {
	
	private int ad_id;
	private String ad_tname;
	private String ad_name;
	private String ad_descrip;
	private String ad_price;
	private String ad_cemail;
	private int ad_mark;
	
	 
	public Ads() {}
	 
	public Ads(int ad_id, String ad_tname, String ad_name, String ad_descrip, String ad_price, String ad_cemail, int ad_mark) {
		
		this.ad_id = ad_id;
		this.ad_tname = ad_tname;
		this.ad_name = ad_name;
		this.ad_descrip = ad_descrip;
		this.ad_price = ad_price;
		this.ad_cemail = ad_cemail;
		this.ad_mark = ad_mark;
	}
	
	public int getAdId() {
		return ad_id;
	}
	
	public void setAdId(int ad_id) {
		this.ad_id = ad_id;
	}
	 
	public String getAdTName() {
		return ad_tname;
	}
	 
	public void setAdTName(String ad_tname) {
		this.ad_tname = ad_tname;
	}
	
	public String getAdName() {
		return ad_name;
	}
	 
	public void setAdName(String ad_name) {
		this.ad_name = ad_name;
	}
	 
	public String getAdDescrip() {
		return ad_descrip;
	}
	 
	public void setAdDescrip(String ad_descrip) {
		this.ad_descrip = ad_descrip;
	}
	
	public String getAdPrice() {
		return ad_price;
	}
	
	public void setAdPrice(String ad_price) {
		this.ad_price = ad_price;
	}
	
	public String getAdCEmail() {
		return ad_cemail;
	}
	
	public void setAdCEmail(String ad_cemail) {
		this.ad_cemail = ad_cemail;
	}
	
	public int getAdMark() {
		return ad_mark;
	}
	
	public void setAdMark(int ad_mark) {
		this.ad_mark = ad_mark;
	}
}
