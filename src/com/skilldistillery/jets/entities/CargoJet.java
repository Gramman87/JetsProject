package com.skilldistillery.jets.entities;

import java.util.Objects;

public class CargoJet extends Jet implements CargoCarrier {
	private double maxFlightTime;

	public CargoJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		maxFlightTime = getRange() / getSpeed();

		System.out.println("I am a " + getModel() + " cargo Jet!");
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
		CargoJet other = (CargoJet) obj;
		return Double.doubleToLongBits(maxFlightTime) == Double.doubleToLongBits(other.maxFlightTime);
	}

	@Override
	public void loadCargo() {

		System.out.println("Cargo is being loaded.");
		System.out.println("  .");
		System.out.println("  .");
		System.out.println("  .");
		System.out.println("  .");
		System.out.println(".....");
		System.out.println(" ...");
		System.out.println("  .");
		System.out.println("Cargo loaded, ready for takeoff!");
		System.out.println();

	}

}
