package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.StudentPerformance;

@Stateless
public class PerformanceCalculator implements StudentPerformance {

	public double getTotal(double num1, double num2, double num3) {
		double total=num1 + num2 + num3;
		return total;
	}
	
	public double getAvg(double total) {
		double avg=total / 3;
		return avg;
	}
	
	public String getGrade(double avg) {
		
		String grade;
		
		if(avg >=70) {
			grade="Distinction";
			
		} else if(avg >=60) {
			grade="Merit";
			
		} else if(avg>=40) {
			grade="Pass";
			
		} else {
			grade="Fail";
		}
		
		return grade;
	}

}
