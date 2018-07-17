package com.jwt.ejb.businesslogic;

import javax.persistence.Entity;

@Entity
public class Fruit {

	private int fruitID;
	private String fruitName;
	private String productCategory;
	private String price;
	private String otherDetails;
	
	public int getFruitID() {
		return fruitID;
	}
	public void setFruitID(int fruitID) {
		this.fruitID = fruitID;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	
}
