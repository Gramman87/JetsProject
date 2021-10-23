package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements AutoPilot {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void autoPilot() {
		
	}
	

}
