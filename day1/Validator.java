package com.week3.day1;

public class Validator {

	public static boolean validateChoice(String numChosen) {

		try {

			int isValid = Integer.parseInt(numChosen);
			if ((isValid < 0) || (isValid > 3)) {
				System.out.println("Invalid entry. Please enter a number 1 - 3");
				return true;
			}
			return false;
		}

		catch (NumberFormatException e) {
			System.out.println("Invalid entry. Please enter a number 1 - 3.");
			return true;
		}

	}
}

