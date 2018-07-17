package com.jwt.ejb.business;

import java.sql.Connection;

public interface MealProducts {

	//INTEREST REPRESENTS OPERATONS FOR ALL MEALS INCLUDING 'RICE', 'PIZZA' ETC.
	
	 public void searchProduct();
	 public void insertProduct();
	 public void updateProduct();
	 public void deleteProduct();
	 
}
