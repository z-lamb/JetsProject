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
				System.out.println();
				System.out.println("Would you like the speed displayed in MPH or Mach?");
				System.out.println("Please enter MPH, Mach, or 0 to return to the main menu");
				System.out.print(">> ");
				userInput = sc.nextLine();
				do {
					switch (userInput) {
					case "mph":
					case "MPH":
						hanger.fastestJet();
						break;
					case "mach":
					case "Mach":
						hanger.fastestJetMach();
						break;
					case "0":
						break;
					default:
						break;
					}
					if (!userInput.equals("0")) {
						if (userInput.equals("mph") || userInput.equals("MPH") || userInput.equals("mach") || userInput.equals("Mach")) {
							break;
						}
						System.out.println();
						System.out.println("Please enter MPH, Mach, or 0 to return to the main menu");
						System.out.print(">> ");
						userInput = sc.nextLine();
					}
				} while (!userInput.equals("0"));
				System.out.println();
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
				System.out.println("What type of airplane would you like to add?");
				System.out.println("Please enter Cargo, Fighter, Vanilla, or 0 to return to the main menu");
				System.out.print(">> ");
				userInput = sc.nextLine();
				System.out.println();
				do {
					switch (userInput) {
					case "Cargo":
					case "cargo":
						newCargo();
						break;
					case "Fighter":
					case "fighter":
						newFighter();
						break;
					case "Vanilla":
					case "vanilla":
						newVanilla();
						break;
					case "0":
						break;
					default:
						break;
					}
					if (!userInput.equals("0")) {
						if (userInput.equals("Cargo") || userInput.equals("cargo") || userInput.equals("Fighter") || 
								userInput.equals("fighter") || userInput.equals("Vanilla") || userInput.equals("vanilla")) {
							break;
						}
						System.out.println("Please enter Cargo, Fighter, Vanilla, or 0 to return to the main menu");
						System.out.print(">> ");
						userInput = sc.nextLine();
						System.out.println();
					}
				} while (!userInput.equals("0"));
				break;
			case "8":
				System.out.println("Thank you for using the Airfield Controller");
				return;
			default:
				System.out.println("Please make a selection between 1-8");
			}
			System.out.println("Please make a selection from the menu below:");
			displayUserMenu();
			userInput = sc.nextLine();
		} while (!userInput.equals("8"));
		sc.close();
	}

	// method to add new VanillaJet
	private void newVanilla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the information for a plane you would like to add to the airfield:");
		System.out.println("Please enter the model");
		System.out.print(">> ");
		String model = sc.nextLine();
		System.out.println("Please enter the speed in mph");
		System.out.print(">> ");
		double speed = sc.nextDouble();
		System.out.println("Please enter the range in miles");
		System.out.print(">> ");
		int range = sc.nextInt();
		System.out.println("Please enter the price in USD");
		System.out.print(">> ");
		long price = sc.nextLong();
		JetImpl newVanillaJet = new JetImpl(model, speed, range, price);

		hanger.addJet(newVanillaJet);
		System.out.println();
	}

	// method to add new CargoJet
	private void newCargo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the information for a plane you would like to add to the airfield:");
		System.out.println("Please enter the model");
		System.out.print(">> ");
		String model = sc.nextLine();
		System.out.println("Please enter the speed in mph");
		System.out.print(">> ");
		double speed = sc.nextDouble();
		System.out.println("Please enter the range in miles");
		System.out.print(">> ");
		int range = sc.nextInt();
		System.out.println("Please enter the price in USD");
		System.out.print(">> ");
		long price = sc.nextLong();
		CargoPlane newCargoJet = new CargoPlane(model, speed, range, price);

		hanger.addJet(newCargoJet);
		System.out.println();
	}

	// method to add new FighterJet
	private void newFighter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the information for a plane you would like to add to the airfield:");
		System.out.println("Please enter the model");
		String model = sc.nextLine();
		System.out.println("Please enter the speed in mph");
		double speed = sc.nextDouble();
		System.out.println("Please enter the range in miles");
		int range = sc.nextInt();
		System.out.println("Please enter the price in USD");
		long price = sc.nextLong();
		FighterJet newFighterJet = new FighterJet(model, speed, range, price);

		hanger.addJet(newFighterJet);
		System.out.println();
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
