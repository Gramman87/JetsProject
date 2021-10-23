package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class AppController {
	Scanner scanner = new Scanner(System.in);
	private AirField airField = new AirField();
	private boolean userPresent = true;
	private int userInput;

	public void launch() {

		System.out.println("Good morning. Welcome to your airfield!");
		airField.populateAirField();

		while (userPresent) {
			printMenu();
			userInput = scanner.nextInt();
			scanner.nextLine();

			switch (userInput) {
			case 1:
				airField.toString();
				break;
			case 2:

			default:
				break;
			}
		}
	}

	public void printMenu() {

		System.out.println();
		System.out.println("============= MENU =============");
		System.out.println("|                              |");
		System.out.println("|   1. List Fleet              |");
		System.out.println("|                              |");
		System.out.println("|   2. Fly all Jets            |");
		System.out.println("|                              |");
		System.out.println("|   3. Display Jets by speed   |");
		System.out.println("|                              |");
		System.out.println("|   4. Display Jets by range   |");
		System.out.println("|                              |");
		System.out.println("|   5. Load all Cargo Jets     |");
		System.out.println("|                              |");
		System.out.println("|   6. Dogfight!               |");
		System.out.println("|                              |");
		System.out.println("|   7. Add Jet to Fleet        |");
		System.out.println("|                              |");
		System.out.println("|   8. Remove Jet from Fleet   |");
		System.out.println("|                              |");
		System.out.println("|   9. Exit                    |");
		System.out.println("|                              |");
		System.out.println("================================");
		System.out.println();

	}
}
