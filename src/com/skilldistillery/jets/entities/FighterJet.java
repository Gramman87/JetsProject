package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println("I fly to keep the skies safe!");

	}

	@Override
	public void dogFight() {
		System.out.println("Time to go to work!");

	}

}
