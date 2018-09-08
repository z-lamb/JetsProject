package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	// CargoPlane constructor
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	// loadCargo method
	public void loadCargo() {
		System.out.println("Cargo being loaded");
	}
	
	
}
