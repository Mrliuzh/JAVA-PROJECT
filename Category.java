package com.briup.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 栏目类
 * */
public class Category implements Serializable{
	private Long id;	
	private String name;	//栏目名称： 财经
	private Integer code;	//栏目码
	//一对多关系，一个栏目下有多个文章
	//private Set<Article> articles = new HashSet<Article>(0);
	private List<Article> articles=new ArrayList<>();
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
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

	/*public Set<Article> getArticles() {
		return articles;
	}*/
	/*public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}*/
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
