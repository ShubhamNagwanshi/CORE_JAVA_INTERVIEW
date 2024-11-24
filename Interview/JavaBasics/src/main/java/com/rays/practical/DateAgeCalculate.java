package com.rays.practical;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {
public static void main(String[] args) {
	
	LocalDate today = LocalDate.now();
	LocalDate empBirth = LocalDate.of(1998, 12, 12);
	Period p = Period.between(empBirth, today);
	
	System.out.println("Employee Age:"+ p.getYears());
			
}
}
