package com.jwt.ejb.businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.business.*;
import com.jwt.ejb.business.ManageBeverage;
import com.jwt.ejb.dataAccess.DatabaseConnection;
import com.jwt.ejb.dataAccess.*;

@Stateless
public class BeverageProductOperation implements ManageBeverage {

	private Beverage bgObj=new Beverage();
	private BeverageDataAccessor bgDAObj=new BeverageDataAccessor();
	
	 public void searchProduct() {
		 
		 try {
			 
			 int beverageID=bgObj.getBeverageID();
			 bgDAObj.searchProduct(beverageID); //SEARCH PRODUCT BUSINESS LOGIC
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void insertProduct() {
		 
		 try {
			 
			 String beverageName=bgObj.getBeverageName();
		     String productCategory=bgObj.getProductCategory();
		     String price=bgObj.getPrice();
		     String otherDetails=bgObj.getOtherDetails();
		     
		     bgDAObj.insertProduct(beverageName, productCategory, price, otherDetails); //INSERT PRODUCT BUSINESS LOGIC
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void updateProduct() {
		 
		 try {
			 
			 int beverageID=bgObj.getBeverageID();
			 String beverageName=bgObj.getBeverageName();
		     String productCategory=bgObj.getProductCategory();
		     String price=bgObj.getPrice();
		     String otherDetails=bgObj.getOtherDetails();
		     
		     bgDAObj.updateProduct(beverageID, beverageName, productCategory, price, otherDetails); //UPDATE PRODUCT BUSINESS LOGIC
			 
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void deleteProduct() {
		 
		 try {
			 
			 int beverageID=bgObj.getBeverageID();
			 bgDAObj.deleteProduct(beverageID); //DELETE PRODUCT BUSINESS LOGIC
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
}
