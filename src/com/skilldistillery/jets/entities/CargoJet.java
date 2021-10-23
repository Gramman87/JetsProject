package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void loadCargo() {
		
		
	}
	
	

}
