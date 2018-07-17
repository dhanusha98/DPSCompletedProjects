package com.jwt.ejb.businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.business.MealProducts;
import com.jwt.ejb.dataAccess.DatabaseConnection;
import com.jwt.ejb.dataAccess.*;

@Stateless
public class MealProductOperation implements MealProducts {

	private Meal mdObj=new Meal();
	private MealDataAccessor mdDAObj=new MealDataAccessor();
 
	 public void searchProduct() {
		 
		 try {
			 
			 int mealID=mdObj.getMealID();
			 mdDAObj.searchProduct(mealID);
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void insertProduct() {
		 
		 try {
			 
			  String mealName=mdObj.getMealName();
			  String mealCategory=mdObj.getMealCategory();
			  String price=mdObj.getPrice();
			  String otherDetails=mdObj.getOtherDetails();
			  
			  mdDAObj.insertProduct(mealName, mealCategory, price, otherDetails);
			 
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void updateProduct() {
		 
		 try {
			 
			  int mealID=mdObj.getMealID();
			  String mealName=mdObj.getMealName();
			  String mealCategory=mdObj.getMealCategory();
			  String price=mdObj.getPrice();
			  String otherDetails=mdObj.getOtherDetails();
			  
			  mdDAObj.updateProduct(mealID, mealName, mealCategory, price, otherDetails);
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 public void deleteProduct() {
		 
		 try {
			 
			 int mealID=mdObj.getMealID();
			 mdDAObj.deleteProduct(mealID);
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
}
