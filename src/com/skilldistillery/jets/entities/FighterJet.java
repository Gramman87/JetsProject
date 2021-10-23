package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {
	private double maxFlightTime;

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		maxFlightTime = getRange() / getSpeed();
		
		System.out.println("I fly to keep the skies safe!");
		System.out.print("Maximum flight time is: ");
		System.out.printf( "%.2f", maxFlightTime);
		System.out.println(" hrs");

	}

	@Override
	public void dogFight() {
		System.out.println("Time to go to work!");

	}

}
