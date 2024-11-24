package com.rays.practical;

public class MissingNumber1 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7};
		int[] b = { 1, 2, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
					break; // Exit the loop once a match is found
				}
			}
			if (count == 0) {
				System.out.println(a[i]);
			}
		}
	}

}
