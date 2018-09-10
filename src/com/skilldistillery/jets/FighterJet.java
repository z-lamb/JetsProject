package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	// FighterJet constructor
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	// fight method
	public void fight() {
		System.out.println(getModel() + " is in a dogfight!");
	}
}
