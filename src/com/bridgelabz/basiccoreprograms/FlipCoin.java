package com.bridgelabz.basiccoreprograms;

public class FlipCoin {

	public static void main(String[] args) {

		int numberOfFlips = 10;
		int headsCount = 0;

		for (int index = 0; index < numberOfFlips; index++) {
			if (numberOfFlips <= 0) {
				System.err.println("Number of Flips has to be greater than 0");
			} else {
				// Math.random return decimal value between 0.0 and 1.0
				if (Math.random() > 0.5) {
					headsCount++;
				}

			}
		}
		int headsPercentage = (headsCount * 100) / numberOfFlips;
		int tailsPercentage = 100 - headsPercentage;
		System.out.println("Heads Percentage = " + headsPercentage);
		System.out.println("Tails Percentage = " + tailsPercentage);
	}

}