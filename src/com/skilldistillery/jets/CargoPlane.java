package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	// CargoPlane constructor
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	// loadFast (interface)
	public void loadFast() {
		System.out.println("Cargo being loaded fast on " + getModel());
	}
	
	// loadCargo
	public void loadCargo() {
		System.out.println("Cargo being loaded on " + getModel());
	}
	
}
