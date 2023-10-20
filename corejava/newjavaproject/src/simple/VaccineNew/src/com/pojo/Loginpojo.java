package com.pojo;

public class Loginpojo {
	String user;
	int pass;
	public Loginpojo(String user, int pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
}
