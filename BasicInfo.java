package com.briup.bean;

import java.io.Serializable;

public class BasicInfo implements Serializable{
	private  Long id;
	
	private String name;
	
	private String address;
	
	private String copyright;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@Override
	public String toString() {
		return "BasicInfo [id=" + id + ", name=" + name + ", address="
				+ address + ", copyright=" + copyright + "]";
	}
	
	
	
	

}
