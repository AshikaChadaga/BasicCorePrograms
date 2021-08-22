package com.bridgelabz.basiccoreprograms;

public class LeapYear {

	public static void main(String[] args) {

		int yearToCheck = 2016;
		boolean isLeapYear = false;

		if (Integer.toString(yearToCheck).length() == 4) {
			if ((yearToCheck % 4 == 0 && yearToCheck % 100 == 0) || yearToCheck % 4 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
		}
		System.out.println(yearToCheck + " is a leap year ? " + isLeapYear);
	}

}