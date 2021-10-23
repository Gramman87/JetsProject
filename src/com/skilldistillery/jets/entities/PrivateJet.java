package com.skilldistillery.jets.entities;

public class PrivateJet extends PassengerJet {
	private int seatingCap;

	public PrivateJet(String model, double speed, int range, long price, int seatingCap) {
		super(model, speed, range, price);
		this.seatingCap = seatingCap;
	}
	
	@Override
	public void autoPilot() {
		
	}

}
