package com.skilldistillery.jets.entities;

import java.util.Objects;

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
		PassengerJet other = (PassengerJet) obj;
		return Double.doubleToLongBits(maxFlightTime) == Double.doubleToLongBits(other.maxFlightTime);
	}

	@Override
	public void autoPilot() {
		System.out.println("Time to kick back and sip some coffee!");
		System.out.println();

	}

}
