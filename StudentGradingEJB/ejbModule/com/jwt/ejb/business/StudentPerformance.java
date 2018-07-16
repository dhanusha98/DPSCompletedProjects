package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface StudentPerformance {
	
	public double getTotal(double num1, double num2, double num3);
	public double getAvg(double total);
	public String getGrade(double avg);
	
}
