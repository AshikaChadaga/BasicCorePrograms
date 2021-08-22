package com.bridgelabz.basiccoreprograms;

public class EvenOrOdd {

	public static void main(String[] args) {

		int numberTocheck = 0;

		if (numberTocheck == 0) {
			System.out.println("0 is neither Even Nor Odd");
			System.exit(0);
		}

		if ((numberTocheck % 2) == 0)
			System.out.println(numberTocheck + " is Even");
		else
			System.out.println(numberTocheck + " is odd");

	}

}
