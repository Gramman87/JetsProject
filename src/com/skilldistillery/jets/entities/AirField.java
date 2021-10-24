package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class AirField {
	Scanner scanner = new Scanner(System.in);
	private List<Jet> fleet;

	public AirField() {

	}

	public void populateAirField() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			String[] tempStrings = new String[5];
			fleet = new ArrayList<>();

			while ((line = bufIn.readLine()) != null) {
				tempStrings = line.split(",");
				if (tempStrings[0].equals("Passenger Jet")) {
					PassengerJet pJet = new PassengerJet(tempStrings[0], tempStrings[1],
							Double.parseDouble(tempStrings[2]), Integer.parseInt(tempStrings[3]),
							Long.parseLong(tempStrings[4]));
					fleet.add(pJet);
				}
				if (tempStrings[0].equals("Fighter Jet")) {
					FighterJet fJet = new FighterJet(tempStrings[0], tempStrings[1], Double.parseDouble(tempStrings[2]),
							Integer.parseInt(tempStrings[3]), Long.parseLong(tempStrings[4]));
					fleet.add(fJet);
				}
				if (tempStrings[0].equals("Cargo Jet")) {
					CargoJet cJet = new CargoJet(tempStrings[0], tempStrings[1], Double.parseDouble(tempStrings[2]),
							Integer.parseInt(tempStrings[3]), Long.parseLong(tempStrings[4]));
					fleet.add(cJet);
				}

			}
		} catch (IOException e) {
			System.err.println(e);

		}

	}

	public void flyJetsMenu() {

		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|    1. Passenger      |");
		System.out.println("|                      |");
		System.out.println("|    2. Fighter        |");
		System.out.println("|                      |");
		System.out.println("|    3. Cargo          |");
		System.out.println("|                      |");
		System.out.println("|    4. All Jets       |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
		System.out.print("Please select from the menu above: ");

		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case 1:
			for (int i = 0; i < fleet.size(); i++) {
				if (fleet.get(i) instanceof PassengerJet) {
					System.out.println(i + ((PassengerJet) fleet.get(i)).toString());
				}
			}
			System.out.print("Please input the number of the jet you would like to fly: ");
			fleet.get(scanner.nextInt()).fly();
			scanner.nextLine();
			break;
		case 2:
			for (int i = 0; i < fleet.size(); i++) {
				if (fleet.get(i) instanceof FighterJet) {
					System.out.println(i + ((FighterJet) fleet.get(i)).toString());
				}
			}
			System.out.print("Please input the number of the jet you would like to fly: ");
			fleet.get(scanner.nextInt()).fly();
			scanner.nextLine();
			break;
		case 3:
			for (int i = 0; i < fleet.size(); i++) {
				if (fleet.get(i) instanceof CargoJet) {
					System.out.println(i + ((CargoJet) fleet.get(i)).toString());
				}
			}
			System.out.print("Please input the number of the jet you would like to fly: ");
			fleet.get(scanner.nextInt()).fly();
			scanner.nextLine();
			break;
		case 4:
			for (Jet jet : fleet) {
				jet.fly();
			}
			break;
		}
	}

	public void fastestJet() {
		double tempSpeed = 0;
		int idx = 0;

		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getSpeed() > tempSpeed) {
				tempSpeed = fleet.get(i).getSpeed();
				idx = i;
			}
		}
		System.out.println(fleet.get(idx));
	}

	public void longestRange() {
		int tempRange = 0;
		int idx = 0;

		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getRange() > tempRange) {
				tempRange = fleet.get(i).getRange();
				idx = i;
			}
		}
		System.out.println(fleet.get(idx));

	}

	public void loadAllCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
			}
		}

	}

	public void allOutWar() {
		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();
			}
		}

	}

	public void breakTime() {
		for (Jet jet : fleet) {
			if (jet instanceof PassengerJet) {
				((PassengerJet) jet).autoPilot();
			}
		}

	}

	public void addJet(String jetType) {
		System.out.println("Please enter the model: ");
		final String model = scanner.nextLine();
		System.out.println("Please enter the top speed: ");
		final double speed = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Please enter the max range: ");
		final int range = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the price: ");
		final long price = scanner.nextLong();
		scanner.nextLine();

		Jet nJet = new Jet(jetType, model, speed, range, price) {
		};

		fleet.add(nJet);
		System.out.println(fleet.toString());

	}

	public void addMenu() {

		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|    A. Passenger      |");
		System.out.println("|                      |");
		System.out.println("|    B. Fighter        |");
		System.out.println("|                      |");
		System.out.println("|    C. Cargo          |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
		System.out.print("Please select your jet type: ");

		String subInput = scanner.next();
		scanner.nextLine();
		switch (subInput) {
		case "A":
		case "a":
			addJet("Passenger Jet");
			break;
		case "B":
		case "b":
			addJet("Fighter Jet");
			break;
		case "C":
		case "c":
			addJet("Cargo Jet");
			break;
		default:
			System.out.println("Please enter a valid type.");
			break;
		}
	}

//	Remove by number selection from menu.

//	public void removeMenu() {
//		
//		for(int i = 0; i < fleet.size(); i++) {
//			System.out.println(i + ": " + fleet.get(i).toString());
//		}
//		
//		System.out.print("Enter the number of the jet to remove: ");
//		int userRemove = scanner.nextInt();
//		System.out.println(fleet.remove(userRemove) + " has been removed.");
//		
//		scanner.close();
//	}

//	Remmove by model name entry.

	public void removeMenu() {
		String deleteModel = null;
		int idx = 0;

		for (Jet jet : fleet) {
			System.out.println(jet.getModel());
		}
		System.out.print("Please enter the model of the jet you would like to delete: ");
		deleteModel = scanner.nextLine();

		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getModel().equalsIgnoreCase(deleteModel)) {
				idx = i;
			}
		}
		System.out.println(fleet.remove(idx) + " has been removed.");

	}

	@Override
	public String toString() {
		return "AirField " + fleet;
	}

}
