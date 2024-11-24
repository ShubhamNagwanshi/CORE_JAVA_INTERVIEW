package com.rays.practical;

import java.util.Arrays;

public class BubbleShort {
public static void main(String[] args) {
	
	int[] num = {100,50,1,10,25};
	
	int temp = 0;
	
	for (int i = 0; i < num.length; i++) {
		
		for (int j = i+1; j < num.length; j++) {
			
			if(num[i]>num[j]) {
				
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
		System.out.println(num[i]);
		
		 System.out.println("Sorted Array: " + Arrays.toString(num));// every loop array print
	}
//	 System.out.println("Sorted Array: " + Arrays.toString(num));
}
}
