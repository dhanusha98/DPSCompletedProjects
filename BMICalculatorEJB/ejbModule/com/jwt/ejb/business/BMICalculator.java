package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface BMICalculator {

	public double calculateBMIScore(double height, double weight);
	public String getBMICategory(double bmiscore);
	public String bmiRecommendation(String bmiCategory);
	
}
