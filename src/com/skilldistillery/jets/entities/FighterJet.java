package com.skilldistillery.jets.entities;

import java.util.Objects;

public class FighterJet extends Jet implements CombatReady {
	private double maxFlightTime;

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		maxFlightTime = getRange() / getSpeed();

		System.out.println("I am a fighter Jet!");
		System.out.print("Maximum flight time is: ");
		System.out.printf("%.2f", maxFlightTime);
		System.out.println(" hrs");
		System.out.println();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(maxFlightTime);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FighterJet other = (FighterJet) obj;
		return Double.doubleToLongBits(maxFlightTime) == Double.doubleToLongBits(other.maxFlightTime);
	}

	@Override
	public void dogFight() {
//		These characters are actually fighter jets!!!
		char fighter = '\uF6E6';
		System.out.println("Time to go to work!");
		System.out.println("  " + fighter);
		System.out.println(" " + fighter + fighter);
		System.out.println("" + fighter + fighter + fighter);
		System.out.println();

	}

}
