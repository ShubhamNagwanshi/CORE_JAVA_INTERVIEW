package com.rays.practical;

public class SwitchExample {
	public static void main(String[] args) {

		int a = 4;
		int b = 5;

		char operator = '*';

		switch (operator) {
		case '+':
			System.out.println("Result:" + (a + b));
			break;

		case '-':
			System.out.println("Result :" + (a - b));
			break;

		case '*':
			System.out.println("Result :" + (a * b));
			break;

		case '/':
			if (b != 0) {
				System.out.println("Result :" + (a / b));
			} else {
				System.out.println("Cannot divide by zero");
			}
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}
