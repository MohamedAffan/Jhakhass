package com.jhakaas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart 
{
	@Column
	String Cartname;
	
	@Column
	String ProductDescription;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String CartId;
	
	@Column
	String Productquantity;
	
	@Column
	String PricePerUnit;
	
	@Column
	String SellerId;
	
	@Column
	String CategoryId;

	public String getCartname() {
		return Cartname;
	}

	public void setCartname(String cartname) {
		Cartname = cartname;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public String getCartId() {
		return CartId;
	}

	public void setCartId(String cartId) {
		CartId = cartId;
	}

	public String getProductquantity() {
		return Productquantity;
	}

	public void setProductquantity(String productquantity) {
		Productquantity = productquantity;
	}

	public String getPricePerUnit() {
		return PricePerUnit;
	}

	public void setPricePerUnit(String pricePerUnit) {
		PricePerUnit = pricePerUnit;
	}

	public String getSellerId() {
		return SellerId;
	}

	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}

	public String getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}
}
	
	