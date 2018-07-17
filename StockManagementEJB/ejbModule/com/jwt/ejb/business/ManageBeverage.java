package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface ManageBeverage {

	 public void searchProduct();
	 public void insertProduct();
	 public void updateProduct();
	 public void deleteProduct();
	
}
