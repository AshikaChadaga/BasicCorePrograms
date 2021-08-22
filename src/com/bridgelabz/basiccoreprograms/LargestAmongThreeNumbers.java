package com.bridgelabz.basiccoreprograms;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int firstNumber = 9;
		int secondNumber = 12;
		int thirdNumber = 2;

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " is Largest");
		} 
		else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is Largest");
		} 
		else {
			System.out.println(thirdNumber + " is Largest");
		}

	}

}
