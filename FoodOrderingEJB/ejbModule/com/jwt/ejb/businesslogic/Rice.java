package com.jwt.ejb.businesslogic;

public class Rice {

	private int riceMealID;
	private String riceName;
	private String category;
	private double price;
	private double discountRate;
	private double quantity;
	
	public Rice()
	{
		this.riceMealID=1000;
		this.riceName="Rice & Curry Normal Rice";
		this.category="Normal Rice";
		this.price=180.00;
		this.discountRate=30;
	}
	
	public int getRiceMealID() {
		return riceMealID;
	}
	public void setRiceMealID(int riceMealID) {
		this.riceMealID = riceMealID;
	}
	public String getRiceName() {
		return riceName;
	}
	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
