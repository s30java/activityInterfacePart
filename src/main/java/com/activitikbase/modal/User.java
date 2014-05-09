package com.activitikbase.modal;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -393739258144890597L;
	private String name;
	private String id;
	private String gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
