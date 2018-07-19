package com.jwt.ejb.businesslogic;

public class Burger {
	
	private int burgerID;
	private String burgerName;
	private String category;
	private double price;
	private double discountRate;
	private double quantity;

	
	public Burger()
	{
		
		this.burgerID=1;
		this.burgerName="Plane Burger";
		this.category="Normal Burger";
		this.price=250.00;
		this.discountRate=25;
	}
	
	public int getBurgerID() {
		return burgerID;
	}
	public void setBurgerID(int burgerID) {
		this.burgerID = burgerID;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
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
