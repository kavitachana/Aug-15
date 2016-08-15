package com.week3.day1;

import java.util.Scanner;

public class CountriesApp {

	Scanner sc = new Scanner(System.in);
	String menuSelection = null;
	boolean userFailed = false;
	int userChoice = 0;
	
	public static void main(String[] args) {

		CountriesApp runCountries = new CountriesApp();
		runCountries.newRun();
	}

	public void newRun() {

		do {
			System.out.println("\nWelcome to the Countries Listing Application \n");
			System.out.println("Please select an option from the menu below: \n" 
					+ "\t 1. Display a list of countires. \n"
					+ "\t 2. Add a new country to the list. \n" 
					+ "\t 3. Exit the application. \n");

			menuSelection = sc.nextLine();
			userFailed = Validator.validateChoice(menuSelection); 	// send input for validation

		} while (userFailed);

		this.setUserChoice(Integer.parseInt(menuSelection)); 	// covert user input to int
		this.menuOptions(userChoice); 			// call menu options and send menu choice

		newRun();
		
		sc.close();
	}

	public void menuOptions(int menuChoice) {

		String newCountry = null;
		ReadAndWrite reader = new ReadAndWrite();
		ReadAndWrite writer = new ReadAndWrite();

		switch (menuChoice) {

		case 1:
			reader.read(); // call read method to list countries
			break;

		case 2:
			System.out.println("Please enter the name of the country you would like to add to the list: ");
			newCountry = sc.nextLine();
			writer.write(newCountry);
			break;
		
		case 3:
			System.out.println("Thank you for using the Country Listing Application. Good Bye! \n");
			System.exit(0);
			break;
		}
	}
	
	
	public int getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(int userChoice) {
		this.userChoice = userChoice;
	}

}
