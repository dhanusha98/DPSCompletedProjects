package com.jwt.ejb.businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.business.ManageFruit;
import com.jwt.ejb.dataAccess.DatabaseConnection;
import com.jwt.ejb.dataAccess.FruitDataAccessor;

@Stateless
public class FruitProductOperation implements ManageFruit {

	private Fruit frObj=new Fruit();
	private FruitDataAccessor frDAObj=new FruitDataAccessor();
	
	 public void searchProduct() {
		 
		 try {
			 
			 int fruitID=frObj.getFruitID();
			 frDAObj.searchProduct(fruitID);
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void insertProduct() {
		 
         try {
			 
        	 String fruitName=frObj.getFruitName();
             String productCategory=frObj.getProductCategory();
        	 String price=frObj.getPrice();
        	 String otherDetails=frObj.getOtherDetails();
        	 
        	 frDAObj.insertProduct(fruitName, productCategory, price, otherDetails);
        	 
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void updateProduct() {
		 
         try {
			 
        	 int fruitID=frObj.getFruitID();
        	 String fruitName=frObj.getFruitName();
             String productCategory=frObj.getProductCategory();
        	 String price=frObj.getPrice();
        	 String otherDetails=frObj.getOtherDetails();
        	 
        	 frDAObj.updateProduct(fruitID, fruitName, productCategory, price, otherDetails);
        	 
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void deleteProduct() {
		 
         try {
        	 
        	 int fruitID=frObj.getFruitID();
        	 frDAObj.deleteProduct(fruitID);
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
}
