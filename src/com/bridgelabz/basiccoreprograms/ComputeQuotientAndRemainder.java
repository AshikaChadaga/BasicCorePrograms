package com.bridgelabz.basiccoreprograms;

public class ComputeQuotientAndRemainder {

	public static void main(String[] args) {

		double firstNumber = 48;
		double secondNumber = 5;

		double quotient = firstNumber / secondNumber;
		int remainder = (int) (firstNumber % secondNumber);

		System.out.println("The Quotient of " + firstNumber + "/" + secondNumber + " is: " + quotient);
		System.out.println("The Remainder of " + firstNumber + "/" + secondNumber + " is: " + remainder);

	}

}
