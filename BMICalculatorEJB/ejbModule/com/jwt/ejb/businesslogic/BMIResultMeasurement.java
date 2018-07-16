package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;
import com.jwt.ejb.business.BMICalculator;

@Stateless
public class BMIResultMeasurement implements BMICalculator {

	public double calculateBMIScore(double height, double weight) {
		
		//NOTE THAT HEIGHT SHOULD BE 'Metres' AND WEIGHT SHOULD BE 'KG'	
		double bmi = (weight / height) / height;
		return bmi;
	}
	
	public String getBMICategory(double bmiscore) {
		
		String bmiCategory="";
		
		if(bmiscore > 30) {
			bmiCategory="OBESE";
			
		} else if(bmiscore > 25 && bmiscore < 29.9) {
			bmiCategory="OVERWEIGHT";
			
		} else if(bmiscore > 18.5 && bmiscore < 24.9) {
			bmiCategory="HEALTHY WEIGHT";
			
		} else if(bmiscore < 18.5) {
			bmiCategory="UNDERWEIGHT";
			
		}
		
		return bmiCategory;
	}
	
	public String bmiRecommendation(String bmiCategory) {
		
		String bmiRecommendation="";
		
		if(bmiCategory.equalsIgnoreCase("OBESE")) {
			
			bmiRecommendation="1. REDUCE OILY FOODS" +
			                  "2. DAILY RUNNING/OTHER EXERCISES 1 HOURS PER DAY" +
					          "3. HIGH CONSUMPTION OF VEGETABLES AND FRUITS";
			
		} else if(bmiCategory.equalsIgnoreCase("OVERWEIGHT")) {
			
			bmiRecommendation="1. REDUCE OILY FOODS" +
	                  "2. DAILY RUNNING/OTHER EXERCISES 30 MINUTES PER DAY" +
			          "3. GOOD CONSUMPTION OF VEGETABLES AND FRUITS";
			
		} else if(bmiCategory.equalsIgnoreCase("HEALTHY WEIGHT")) {
			
			bmiRecommendation="1. MAINTAIN HEALTHY WEIGHT CONTINOUSLY" +
	                  "2. SWIMMING/GYM AND OTHER EXERCISES AT LEAST 30 MINUTES PER DAY" +
			          "3. STRONG CONSUMPTION OF PROTEIN, VITAMINS ETC.";
			
		} else if(bmiCategory.equalsIgnoreCase("UNDERWEIGHT")) {
			
			bmiRecommendation="1. INCREASE BODY WEIGHT TO FALL UNDER HEALTHY WEIGHT CATEGORY" +
	                  "2. GYM EXERCISES" +
			          "3. STRONG CONSUMPTION OF PROTEIN, MULTI-VITAMIN CAPSULES/FRUITS ETC.";
		}
		
		return bmiRecommendation;
	}
}
