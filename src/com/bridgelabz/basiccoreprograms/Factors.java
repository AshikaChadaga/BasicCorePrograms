package com.bridgelabz.basiccoreprograms;

public class Factors {

	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);

		System.out.println("The Prime Factors for " + number + " are:");
		for (int index = 2; index * index <= number; index++) {
			if (number % index == 0) {
				System.out.println(index + " ");
				number = number / index;
			}
		}
		if (number > 2) {
			System.out.println(number);
		}
	}

}
