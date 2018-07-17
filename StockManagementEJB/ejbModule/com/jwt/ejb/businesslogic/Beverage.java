package com.jwt.ejb.businesslogic;

import javax.persistence.Entity;

@Entity
public class Beverage {

	private int beverageID;
	private String beverageName;
	private String productCategory;
	private String price;
	private String otherDetails;
	
	public int getBeverageID() {
		return beverageID;
	}
	public void setBeverageID(int beverageID) {
		this.beverageID = beverageID;
	}
	public String getBeverageName() {
		return beverageName;
	}
	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
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
