package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements AutoPilot {
	private double maxFlightTime;

	public PassengerJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		maxFlightTime = getRange() / getSpeed();
		
		System.out.println("I carry hundreds of passengers when I fly!");
		System.out.print("Maximum flight time is: ");
		System.out.printf("%.2f", maxFlightTime);
		System.out.println(" hrs");

	}

	@Override
	public void autoPilot() {
		System.out.println("Time to kick back and sip some coffee!");

	}

}
