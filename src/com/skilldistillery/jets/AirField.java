package com.skilldistillery.jets;

public class AirField {

	CargoPlane cp1 = new CargoPlane("Boeing C-17 Globemaster III", 515, 2785, 218000000);
	CargoPlane cp2 = new CargoPlane("Lockheed C-5M Super Galaxy", 518, 5695, 22954000);
	FighterJet fj1 = new FighterJet("Lockheed Martin F-35 Lightning II", 1200, 1367, 121800000);
	FighterJet fj2 = new FighterJet("Lockheed Martin F-22 Raptor", 1500, 1840, 150000000);
	FighterJet fj3 = new FighterJet("Lockheed Martin SR-71 Blackbird", 2200, 3356, 40000000);
	
	// creates array called jets and made it 100
	private Jet[] jets = new Jet[100];
	
	jet[0] = cp1;
	jet[1] = cp2;
	jet[2] = fj1;
	jet[3] = fj2;
	jet[4] = fj3;
	
	// no-arg constructor
	public AirField() {
		
	}
	
}
