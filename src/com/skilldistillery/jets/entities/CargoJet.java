package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println("I have a large bay that can be filled with lots of cargo when I fly.");

	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo is being loaded.");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("Cargo loaded, ready for takeoff!");

	}

}
