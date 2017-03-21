package com.jhakaas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category 
{
	@Column
	String Categoryname;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String CategoryId;
	@Column
	String CategoryDescription;
	
	
	public String getCategoryname() {
		return Categoryname;
	}

	public void setCategoryname(String Categoryname) {
		this.Categoryname = Categoryname;
	}

	public String getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(String CategoryId) {
		this.CategoryId = CategoryId;
	}

	public String getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(String CategoryDescription) {
		this.CategoryDescription = CategoryDescription;
	}

	
}
