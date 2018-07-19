package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.FoodFunction;

@Stateless
public class BurgerFunction extends FoodFunction {

	private Burger bgObj=new Burger();
	
	@Override
	public void getProductTransactionDetails()
	{
		
        double discountAmount=bgObj.getPrice() / 100 * bgObj.getDiscountRate();
		
		System.out.println("===============================================================");
		System.out.println("                   DETAILS OF BURGER MEAL TRANSACTIONS         ");
		System.out.println("===============================================================");

		System.out.println("BURGER ID: "+bgObj.getBurgerID());
		System.out.println("BURGER NAME: "+bgObj.getBurgerName());
		System.out.println("BURGER CATEGORY: "+bgObj.getCategory());
		System.out.println("PRICE (PER ITEM): "+bgObj.getPrice());
		System.out.println("DISCOUNT RATE: "+bgObj.getDiscountRate());
		System.out.println("DISCOUNT AMOUNT: "+discountAmount);
		System.out.println();
		System.out.println("TOTAL PRICE: "+this.calculatePrice());
		
	}
	
	@Override
	public double calculatePrice() 
	{
		double itemPrice=bgObj.getPrice();
		double discountRate=bgObj.getDiscountRate();
		
		double priceBeforeDiscount=itemPrice * bgObj.getQuantity();
		double discountAmount=(priceBeforeDiscount) / 100 * discountRate;
		
		double finalPrice=priceBeforeDiscount - discountAmount;
		
		return finalPrice;
	}
}
