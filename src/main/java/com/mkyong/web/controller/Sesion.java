package com.mkyong.web.controller;

import java.io.Serializable;

public class Sesion implements Serializable {
	
	private static final long serialVersionUID = 388014555422844149L;
	
	public Sesion(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	String user;
	String password;

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Sesion [user=" + user + ", password=" + password + "]";
	}
	
	

}
