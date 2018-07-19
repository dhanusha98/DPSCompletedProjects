package com.jwt.ejb.businesslogic;

public class Pizza {

	private int pizzaID;
	private String pizzaName;
	private String category;
	private double price;
	private double discountRate;
	private double quantity;
	
	public int getPizzaID() {
		return pizzaID;
	}
	public void setPizzaID(int pizzaID) {
		this.pizzaID = pizzaID;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
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
