package com.bridgelabz.basiccoreprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int firstNumber = 48;
		int secondNumber = 5;
		int temporaryVariable;

		System.out.println("----- Before Swapping -----");
		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);

		// Swapping Logic
		temporaryVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temporaryVariable;

		System.out.println("----- After Swapping ------");
		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);

	}

}
