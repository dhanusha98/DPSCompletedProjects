package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.FoodFunction;

@Stateless
public class RiceFunction extends FoodFunction {
	
	private Rice riceObj=new Rice();
	
	@Override
	public void getProductTransactionDetails()
	{
		
        double discountAmount=riceObj.getPrice() / 100 * riceObj.getDiscountRate();
		
		System.out.println("===============================================================");
		System.out.println("                   DETAILS OF RICE MEAL TRANSACTIONS               ");
		System.out.println("===============================================================");

		System.out.println("RICE ID: "+riceObj.getRiceMealID());
		System.out.println("RICE NAME: "+riceObj.getRiceName());
		System.out.println("RICE CATEGORY: "+riceObj.getCategory());
		System.out.println("PRICE (PER ITEM): "+riceObj.getPrice());
		System.out.println("DISCOUNT RATE: "+riceObj.getDiscountRate());
		System.out.println("DISCOUNT AMOUNT: "+discountAmount);
		System.out.println();
		System.out.println("TOTAL PRICE: "+this.calculatePrice());
		
	}
	
	@Override
	public double calculatePrice()
	{
		
		double itemPrice=riceObj.getPrice();
		double discountRate=riceObj.getDiscountRate();
		
		double priceBeforeDiscount=itemPrice * riceObj.getQuantity();
		double discountAmount=(priceBeforeDiscount /100) * discountRate;
		
		return discountAmount;
	}

}
