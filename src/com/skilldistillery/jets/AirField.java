package com.skilldistillery.jets;

public class AirField {

	private Jet[] jets;

	public AirField() {
		CargoPlane cp1 = new CargoPlane("Boeing C-17 Globemaster III", 515, 2785, 218000000);
		CargoPlane cp2 = new CargoPlane("Lockheed C-5M Super Galaxy", 518, 5695, 22954000);
		FighterJet fj1 = new FighterJet("Lockheed Martin F-35 Lightning II", 1200, 1367, 121800000);
		FighterJet fj2 = new FighterJet("Lockheed Martin F-22 Raptor", 1500, 1840, 150000000);
		FighterJet fj3 = new FighterJet("Lockheed Martin SR-71 Blackbird", 2200, 3356, 40000000);

		// creates array called jets and made it 100
		jets = new Jet[10];

		// assigns jets to the array
		jets[0] = cp1;
		jets[1] = cp2;
		jets[2] = fj1;
		jets[3] = fj2;
		jets[4] = fj3;
	}

	public void listFleet() {
		
		System.out.println();
		for (Jet jet : jets) {
			if(jet != null) {
				System.out.println(jet);
			}
		}
		System.out.println();
	}
	
	public void flyAllJets() {
			
		System.out.println();
		for (Jet jet : jets) {
			if(jet != null) {
				jet.fly();
			}
		}
		System.out.println();
	}
	public void fastestJet() {
		
		System.out.println();
		double fast = 0;
		String model = "";
		for (Jet jet : jets) {
			if(jet != null) {
				if (jet.getSpeed() > fast) {
					fast = jet.getSpeed();
					model = jet.getModel();
				}
			}
		}
		System.out.println(model + " is the fastest Jet with a speed of " + fast + " mph.");
		System.out.println();
	}
	public void longestRangeJet() {
		
		System.out.println();
		int longest = 0;
		String model = "";
		for (Jet jet : jets) {
			if(jet != null) {
				if (jet.getRange() > longest) {
					longest = jet.getRange();
					model = jet.getModel();
				}
			}
		}
		System.out.println(model + " is the fly the furthest with a range of " + longest + " miles.");
		System.out.println();
	}
	
	public void cargoJets() {
		System.out.println();
		for (Jet jet : jets) {
			if(jet != null) {
				if(jet instanceof CargoCarrier) {
					((CargoCarrier)jet).loadCargo();
					
				}
			}
		}
		System.out.println();
	}
	
	public void fightJets() {
		System.out.println();
		for (Jet jet : jets) {
			if(jet != null) {
				if(jet instanceof FighterJet) {
					((FighterJet)jet).fight();;
					
				}
			}
		}
		System.out.println();
	}

}
