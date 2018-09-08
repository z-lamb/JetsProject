package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApplication {

	public static JetApplication jetApp = new JetApplication();

	// creates a new AirField
	AirField hanger = new AirField();
	
	public static void main(String[] args) {


		// calls launch method in the JetApplication
		jetApp.launch();

	}

	// launch method where most coding will happen
	private void launch() {

		// creates scanner for user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please make a selection from the menu below:");
		displayUserMenu();
		String userInput = sc.nextLine();
		do {
			switch (userInput) {
			case "1":
				hanger.listFleet();
				break;
			case "2":
				hanger.flyAllJets();
				break;
			case "3":
				hanger.fastestJet();
				break;
			case "4":
				hanger.longestRangeJet();
				break;
			case "5":
				hanger.cargoJets();
				break;
			case "6":
				hanger.fightJets();
				break;
			case "7":
				System.out.println();
				System.out.println("Please enter the information for a plane you would like to add to the airfield:");
				System.out.println("Please enter the model");
				String model = sc.nextLine();
				System.out.println("Please enter the speed in mph");
				double speed = sc.nextDouble();
				System.out.println("Please enter the range in miles");
				int range = sc.nextInt();
				System.out.println("Please enter the price in USD");
				long price = sc.nextLong();
				JetImpl newJet = new JetImpl(model, speed, range, price);
				
				hanger.addJet(newJet);
				System.out.println();
				sc.nextLine();
				break;
			case "8":
				return;
			case "9":
				hanger.loadCargo();
				break;
			default:
				System.out.println("Please make a selection between 1-8");
			}
			System.out.println("Please make a selection from the menu below:");
			displayUserMenu();
			userInput = sc.nextLine();
		} while (!userInput.equals("8"));
	sc.close();
	}

	// displayUserMenu method
	private void displayUserMenu() {

		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Quit");
		System.out.print(">> ");

	}
	

}
