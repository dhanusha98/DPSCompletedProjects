package com.jwt.ejb.business;

import javax.ejb.Stateless;

import com.jwt.ejb.businesslogic.Food;

@Stateless
public class FoodFunction {
	
	private Food foodObj=new Food();

	public void getProductTransactionDetails()
	{
		
        double discountAmount=foodObj.getFoodPrice() / 100 * foodObj.getDiscountRate();

        System.out.println("===============================================================");
		System.out.println("                   DETAILS OF BURGER MEAL TRANSACTIONS               ");
		System.out.println("===============================================================");

		System.out.println("BURGER ID: "+foodObj.getFoodID());
		System.out.println("BURGER NAME: "+foodObj.getFoodName());
		System.out.println("BURGER CATEGORY: "+foodObj.getFoodType());
		System.out.println("PRICE (PER ITEM): "+foodObj.getFoodPrice());
		System.out.println("DISCOUNT RATE: "+foodObj.getDiscountRate());
		System.out.println("DISCOUNT AMOUNT: "+discountAmount);
		System.out.println();
		System.out.println("TOTAL PRICE: "+this.calculatePrice());
		
	}
	public double calculatePrice()
	{
		
		double itemPrice=foodObj.getFoodPrice();
		double discountRate=foodObj.getDiscountRate();
		
		double priceBeforeDiscount=itemPrice * foodObj.getQuantity();
		double discountAmount=(priceBeforeDiscount) / 100 * discountRate;
		
		double finalPrice=priceBeforeDiscount - discountAmount;
		
		return finalPrice;
		
	}
}
