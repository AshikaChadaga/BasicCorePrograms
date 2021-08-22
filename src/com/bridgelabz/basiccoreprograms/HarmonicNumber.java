package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value N : ");
		int N = sc.nextInt();
		sc.close();

		double harmonicNumber = 1.0f;
		if (N == 0) {
			System.err.println("The value of N cannot be 0");
			System.exit(0);
		}

		for (int index = 2; index <= N; index++) {
			double fraction = 1.0 / index;
			harmonicNumber += fraction;
		}
		System.out.println("Harmonic Number for N = " + N + " is : " + harmonicNumber);

	}

}
