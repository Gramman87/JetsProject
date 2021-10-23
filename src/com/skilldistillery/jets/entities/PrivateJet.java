package com.skilldistillery.jets.entities;

public class PrivateJet extends PassengerJet {

	public PrivateJet(String model, double speed, int range, long price, int seatingCap) {
		super(model, speed, range, price);
		
	}
	
	@Override
	public void autoPilot() {
		
	}

}
