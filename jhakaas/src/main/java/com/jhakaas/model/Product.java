package com.jhakaas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Column
	String Productname;
	
	@Column
	String ProductDescription;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String ProductId;
	
	@Column
	String Productquantity;
	
	@Column
	String PricePerUnit;
	
	@Column
	String SellerId;
	
	@Column
	String CategoryId;
	
	



	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String ProductDescription) {
		this.ProductDescription = ProductDescription;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String ProductId) {
		this.ProductId = ProductId;
	}
	
	public String getProductquantity() {
		return Productquantity;
	}

	public void setProductquantity(String Productquantity) {
		this.Productquantity = Productquantity;
	}
	
	public String getPricePerUnit() {
		return PricePerUnit ;
	}

	public void setPricePerUnit(String PricePerUnit) {
		this.PricePerUnit = PricePerUnit;
	}
	
	public String getSellerId() {
		return SellerId ;
	}

	public void setSellerId(String SellerId) {
		this.SellerId = SellerId;
	}
	
	
	public String getCategoryId() {
		return CategoryId ;
	}

	public void setCategoryId(String CategoryId) {
		this.CategoryId = CategoryId;
	}
	
	
	
}
