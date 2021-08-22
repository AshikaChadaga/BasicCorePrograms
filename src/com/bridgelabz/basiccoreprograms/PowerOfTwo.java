package com.bridgelabz.basiccoreprograms;

//import java.util.*;

public class PowerOfTwo {

	public static void checkLeapYear(int yearToCheck) {

		boolean isLeapYear = false;
		if (yearToCheck < 1582) {
			System.err.println("Year must be greater than 1582 : first year of Gregorian calender\n");
			return;
		} else {
			if ((yearToCheck % 4 == 0 && yearToCheck % 100 == 0) || yearToCheck % 4 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
		}

		System.out.println(yearToCheck + " is a leap year ? " + isLeapYear + "\n");
	}

	public static void main(String[] args) {

		int N = Integer.parseInt(args[0]);

		if (!(0 <= N && N < 31)) {
			System.err.println("Value of N must be between 0 and 31");
			System.exit(0);
		}

		for (int index = 0; index < N; index++) {
			double powersOf2 = Math.pow(2, index);
			System.out.println("2 ^ " + index + " = " + powersOf2 + "\n");
			if (index == 10 || index == 11 || index == 12 || index == 13) {
				checkLeapYear((int) powersOf2);
			}

		}
	}

}
