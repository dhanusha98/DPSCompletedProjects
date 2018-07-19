package com.jwt.ejb.businesslogic;

public class Food {
	
	private int foodID;
	private String foodName;
	private String foodType;
	private double foodPrice;
	private String foodOtherDetails;
	private double discountRate;
	private double quantity;
	
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodOtherDetails() {
		return foodOtherDetails;
	}
	public void setFoodOtherDetails(String foodOtherDetails) {
		this.foodOtherDetails = foodOtherDetails;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
