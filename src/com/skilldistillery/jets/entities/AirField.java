package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
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
				if(tempStrings[0].equals("Passenger Jet")) {
					PassengerJet pJet = new PassengerJet(tempStrings[0], tempStrings[1], Double.parseDouble(tempStrings[2]), Integer.parseInt(tempStrings[3]), Long.parseLong(tempStrings[4]));
					fleet.add(pJet);
				}
				if(tempStrings[0].equals("Fighter Jet")) {
					FighterJet fJet = new FighterJet(tempStrings[0], tempStrings[1], Double.parseDouble(tempStrings[2]), Integer.parseInt(tempStrings[3]), Long.parseLong(tempStrings[4]));
					fleet.add(fJet);
				}
				if(tempStrings[0].equals("Cargo Jet")) {
					CargoJet cJet = new CargoJet(tempStrings[0], tempStrings[1], Double.parseDouble(tempStrings[2]), Integer.parseInt(tempStrings[3]), Long.parseLong(tempStrings[4]));
					fleet.add(cJet);
				}

			}
		} catch (IOException e) {
			System.err.println(e);

		}

	}

}
