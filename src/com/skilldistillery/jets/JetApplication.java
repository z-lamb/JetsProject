package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApplication {
	
	public static JetApplication jetApp = new JetApplication();

	public static void main(String[] args) {

		// creates a new AirField
		AirField hanger = new AirField();
		
		// creates scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		// calls launch method in the JetApplication
		jetApp.launch();
		
	}

	// launch method where most coding will happen
	private void launch() {
		// TODO Auto-generated method stub
		
	}
	
	//displayUserMenu method
	private void displayUserMenu() {
		
	}

}
