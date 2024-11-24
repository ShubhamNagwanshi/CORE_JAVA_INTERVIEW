package com.rays.practical;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2024, Calendar.JANUARY, 10);
		for (int i = 1; i <= 5; i++) {
			c.add(Calendar.DATE, 30);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			
			System.out.println(sdf.format(c.getTime()));
		}
	}

}
