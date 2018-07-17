package com.jwt.ejb.businesslogic;

import javax.persistence.Entity;

@Entity
public class Meal {

	private int mealID;
	private String mealName;
	private String mealCategory;
	private String price;
	private String otherDetails;
	
	public int getMealID() {
		return mealID;
	}
	public void setMealID(int mealID) {
		this.mealID = mealID;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public String getMealCategory() {
		return mealCategory;
	}
	public void setMealCategory(String mealCategory) {
		this.mealCategory = mealCategory;
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
