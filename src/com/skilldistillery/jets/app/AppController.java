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
		airField.populateCrew();

		while (userPresent) {
			printMenu();
			System.out.print("Please select from the menu above: ");
			userInput = scanner.nextInt();
			scanner.nextLine();

			switch (userInput) {
			case 1:
				System.out.println(airField.toString());
				break;
			case 2:
				airField.flyJetsMenu();
				break;
			case 3:
				airField.fastestJet();
				break;
			case 4:
				airField.longestRange();
				break;
			case 5:
				airField.loadAllCargo();
				break;
			case 6:
				airField.allOutWar();
				break;
			case 7:
				airField.breakTime();
				break;
			case 8:
				airField.addMenu();
				break;
			case 9:
				airField.removeMenu();
				break;
			case 0:
				System.out.println("Have a nice day!");
				userPresent = false;
				break;
			}
		}
		scanner.close();
	}

	public void printMenu() {

		System.out.println();
		System.out.println("============= MENU =============");
		System.out.println("|                              |");
		System.out.println("|   1. List Fleet              |");
		System.out.println("|                              |");
		System.out.println("|   2. Fly Jets                |");
		System.out.println("|                              |");
		System.out.println("|   3. Fastest Jet             |");
		System.out.println("|                              |");
		System.out.println("|   4. Jet with longest Range  |");
		System.out.println("|                              |");
		System.out.println("|   5. Load all Cargo Jets     |");
		System.out.println("|                              |");
		System.out.println("|   6. Dogfight!               |");
		System.out.println("|                              |");
		System.out.println("|   7. Time for a break        |");
		System.out.println("|                              |");
		System.out.println("|   8. Add Jet to Fleet        |");
		System.out.println("|                              |");
		System.out.println("|   9. Remove Jet from Fleet   |");
		System.out.println("|                              |");
		System.out.println("|   0. Exit                    |");
		System.out.println("|                              |");
		System.out.println("================================");
		System.out.println();

	}

}
