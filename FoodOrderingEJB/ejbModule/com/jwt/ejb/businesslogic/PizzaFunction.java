package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.FoodFunction;

@Stateless
public class PizzaFunction extends FoodFunction {
	
	private Pizza pizzaObj=new Pizza();
	
	@Override
	public void getProductTransactionDetails()
	{
		
		double discountAmount=pizzaObj.getPrice() / 100 * pizzaObj.getDiscountRate();
		
		System.out.println("===============================================================");
		System.out.println("                   DETAILS OF PIZZA MEAL TRANSACTIONS          ");
		System.out.println("===============================================================");

		System.out.println("PIZZA ID: "+pizzaObj.getPizzaID());
		System.out.println("PIZZA NAME: "+pizzaObj.getPizzaName());
		System.out.println("PIZZA CATEGORY: "+pizzaObj.getCategory());
		System.out.println("PRICE (PER ITEM): "+pizzaObj.getPrice());
		System.out.println("DISCOUNT RATE: "+pizzaObj.getDiscountRate());
		System.out.println("DISCOUNT AMOUNT: "+discountAmount);
		System.out.println();
		System.out.println("TOTAL PRICE: "+this.calculatePrice());
	}
	
	@Override
	public double calculatePrice()
	{
		
		double itemPrice=pizzaObj.getPrice();
		double discountRate=pizzaObj.getDiscountRate();
		
		double priceBeforeAmount=itemPrice * pizzaObj.getQuantity();
		double discountAmount=priceBeforeAmount / 100 * discountRate;
		
		double priceAfterAmount=priceBeforeAmount - discountAmount;
		
		return priceAfterAmount;
	}

}
