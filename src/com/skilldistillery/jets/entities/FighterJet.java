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
		System.out.println("Maximum flight time is: " + maxFlightTime);

	}

	@Override
	public void dogFight() {
		System.out.println("Time to go to work!");

	}

}
