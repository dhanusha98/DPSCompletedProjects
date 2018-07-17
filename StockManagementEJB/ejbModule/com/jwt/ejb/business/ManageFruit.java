package com.jwt.ejb.business;

import java.sql.Connection;

import javax.ejb.Remote;

@Remote
public interface ManageFruit {

	 public void searchProduct();
	 public void insertProduct();
	 public void updateProduct();
	 public void deleteProduct();
}
