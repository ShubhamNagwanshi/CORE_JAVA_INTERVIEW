package com.rays.practical;

public class HighestNumber {
public static void main(String[] args) {
	
	int[] arr = {2,5,45,74,13};
	int a = 0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] > a) {
			a = arr[i];
		}
	}
	System.out.println(a);
}
}
