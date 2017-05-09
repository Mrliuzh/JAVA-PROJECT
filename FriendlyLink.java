package com.briup.bean;

import java.io.Serializable;

public class FriendlyLink implements Serializable{
	private Long id;
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "FriendlyLink [id=" + id + ", name=" + name + ", url=" + url
				+ "]";
	}

}
