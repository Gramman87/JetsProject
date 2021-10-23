package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements AutoPilot {

	public PassengerJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println("I carry hundreds of passengers when I fly!");

	}

	@Override
	public void autoPilot() {
		System.out.println("Time to kick back and sip some coffee!");

	}

}
