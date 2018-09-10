## Jets Project

### Week 2 Homework for SKill Distillery

### Summary
This program displays and manages a fleet of Jet objects. An option menu is given where you have multiple choices for what you can do with the fleet of objects. This includes listing the fleet, making the fleet fly, viewing the fastest object in the fleet, viewing the object with the longest range, loading Cargo into the fleet, having a dogfight, and finally adding a new jet to the fleet.

### Overview
This program was created with just under two weeks in the bootcamp as we had one short week due to a holiday. We hit on objects this week and the four pillars of object oriented programming. The four pillars are Abstraction, Polymorphism, Inheritance, and Encapsulation. We also learned the many ways of being able to use and access other classes which includes getters and setters as well as the use of interfaces.

####Menu Options:
- 1. List fleet
- 2. Fly all jets
- 3. View fastest jet
	- View in MPH
	- View in Mach
	- Return to main menu
- 4. View jet with longest range
- 5. Load Cargo Jets
- 6. Dogfight!
- 7. Add a jet to Fleet
	- Add Cargo Jet
	- Add Fighter Jet
	- Add Vanilla Jet
- 8. Quit program

#### Classes
- Jet Application
- Jet class
- CargoPlane class
- FighterJet class
- JetImpl class
- CargoCarrier interface
- CombatReady interface
- AirField class

###Operation/Description of how program works:
Follow these instructions for proper operation of the program
Be sure all classes are in the same package
See below for menu operation

Jet Application is where the program runs
It starts with creating an instance of itself so that we can call launch in the main method. This is the only method call in the main method which gets the ball rolling. A public object of an AirField is created and called hanger so that we can call the methods inside of the AirField class.

Menu operation
- After starting the program the menu will be the first thing to pop up
- Select one of the menu options
- Option 1 will show the whole fleet of aircraft
- Option 2 will have all of the aircraft fly
- Option 3 will have a sub menu pop up
	- The sub menu asks if you would like to see the fastest jet in MPH or Mach speed
	- The other option for the sub menu is to return to the main menu
- Option 4 will show the Jet with the longest range
- Option 5 will load all of the Cargo jets
- Option 6 will have all of the fighter jets in a dogfight
- Option 7 will have a sub menu pop up
	- The sub menu asks if you would like to add a Cargo, Fighter, or Vanilla plane to the fleet
	- The other option for the sub menu is to return to the main menu
- Option 8 will quit the program

After each menu or sub menu item is selected it will bring you back to the main menu. If an option is entered that is not available on the that menu you will be prompted again to make the correct selection.

launch() method
starts by creating a new scanner to be used inside the method
calls the menu method to display the menu
prompts user to make a selection in the switch
each case is an option t use and then breaks to exit the menu
case 1
calls the object named hanger and the method inside that object called listFleet()
case 2
calls the object named hanger and the method inside that object called flyAllJets()
case 3
prompts the user in a sub menu if they want MPH or Mach displayed inside the switch
each case accounts for fully uppercase or lowercase
case MPH
calls the object named hanger and the method inside that object called fastestJet()
case MACH
calls the object named hanger and the method inside that object called fastestJetMach()
case 0
returns to the main menu
default just breaks out of the switch
if the user did not enter 0 it will print the menu again for them to make a selection
if the user entered the cases for mph or mach they will exit the sub menu and go back to the main menu
the sub menu is inside in a do while loop to make sure they have the option to choose an item in the sub menu
case 4
calls the object named hanger and the method inside that object called longestRangeJet()
case 5
calls the object named hanger and the method inside that object called cargoJets()
case 6
calls the object named hanger and the method inside that object called fightJets()
case 7
prompts the user in a sub menu if they want to add a cargo jet, a fighter jet, or a vanilla jet displayed inside the switch
each case accounts for fully uppercase or lowercase
case cargo
calls the newCargo() method
case MACH
calls the newFighter() method
case MACH
calls the newVanilla() method
case 0
returns to the main menu
default just breaks out of the switch
if the user did not enter 0 it will print the menu again for them to make a selection
if the user entered the cases for cargo, fighter, or vanilla they will exit the sub menu and go back to the main menu
the sub menu is inside in a do while loop to make sure they have the option to choose an item in the sub menu
case 8
exits the program
default prompts the user to make a selection from the main menu
close the scanner
newVanilla() method
creates scanner for user prompts
asks the user to enter in model, speed, range, price individually
creates a newVanillaJet object and stores the input into the appropriate places
calls the addJet method into the object hanger and passes through the newVanillaJet object
newCargo() method
creates scanner for user prompts
asks the user to enter in model, speed, range, price individually
creates a newCargoJet object and stores the input into the appropriate places
calls the addJet method into the object hanger and passes through the newCargoJet object
newFighter() method
creates scanner for user prompts
asks the user to enter in model, speed, range, price individually
creates a newFighterJet object and stores the input into the appropriate places
calls the addJet method into the object hanger and passes through the newFighterJet object
displayUserMenu() method
displays the main user menu

Jet class
declares Sting model
declares double speed
declares int range
declares long price
fly() method
prints out the model of the plane that has taken off
getSpeedInMach() method
calculates mach speed from the airplane selected and returns the speed as a double
getters and setters for all variables
hash code
equals code
toString
Jet constructor
no-args Jet constructor

JetImpl class extends from Jet
JetImpl constructor
CargoPlane class extends from Jet implements CargoCarrier
CargoPlane constructor
loadCargo() method which is an interface of CargoCarrier
FighterJet class extends from Jet implements CombatReady
FighterJet constructor
fight() method which is an interface of CombatReady

CargoCarrier interface
loadCargo() method

CombatReady interface
fight() method

AirField class
imports DecimalFormat
create private variable jets array
create new object for decimal format
empty AirField constructor
create 5 new plane objects
create new array of 10
assign the 5 plane objects to locations in the array
listFleet() method
iterates over a foreach loop in the jets array
if the jet array location is not equal to null call the fly method from the Jet class
fastestJet() method
declare double fast variable and assign it 0
declare String model variable and assign it to ""
iterates over a foreach loop in the jets array
if the jet array location is not equal to null check to see if the the speed is faster than the current value of fast
if the speed is faster update the variable fast and model with the current airplane information
fastestJetMach() method
declare double fast variable and assign it 0
declare String model variable and assign it to ""
iterates over a foreach loop in the jets array
if the jet array location is not equal to null check to see if the the speed is faster than the current value of fast
if the speed is faster update the variable fast with the getSpeedInMach and model with the current airplane information and update the decimal format in the output
fastestJet() method
declare double fast variable and assign it 0
declare String model variable and assign it to ""
iterates over a foreach loop in the jets array
if the jet array location is not equal to null check to see if the the range is greater than the current value of range
if the range is greater than the value for range update the variable fast and model with the current airplane information

...add the last methods for the class...


### Technologies/Techniques Used
- Created an instance of the main application to be able to launch the app inside of the main and have that be the only method in there.
- Used the launch method to be where most of the program exists
- Scanner
- print/println
- method calls
- do while loop
- switch
- call other methods from another class
- multiple classes
- Created new objects and passed multiple parameters through
- array
- foreach loop
- for loop
- updating a variable within an if statement
- interface
- instanceof
- casting objects to be a different variable
- getters
- setters
- hashCode
- equalsCode
- toString
- constructors
- no-args constructors

### Lessons Learned
- Do test driven development so that you don't have to go back and check on things later to make sure that they still work.
- I need to spend less time on how the print out format looks and more time obtaining the mvp. Once the mvp is obtained go for a few stretch goals and work on the README.md before working on how the format of the print out looks.
- Learned some about how interfaces work in the program.
- Obtained a better understanding of how to use getters and setters.
- Stick to the UML. It is amazing at how easy it is to stray from the project where it will be more efficient to stick with a plan and make the plan happen instead of the rabbit holes you can go into.
- One important thing is to keep on top of adding comments while you code so that you aren't trying to go back and add comments after all of the code is done.
- It took much longer than expected to add a simple return to main menu option. The issue that I ran into was the when you are at the switch and elect to go back to the main menu there wouldn't be an issue but when you elected to do a sub menu option you would be put back into the sub menu and have to choose to go back to the main menu again. Eventually I was able to make it work with a few if statements but it still took longer than I expected it to.ui

### Problems/Issues 
- I was unable to close all scanners
	- Whenever I would call a method that used a scanner it would give me an error when it went back to the original method at another spot where I would need a scanner
- From my main application I had one spot where I was repeating some code so I was going to try any move that to a new method. 
	- The issue that I ran into was I needed to return multiple items from the method. I was going to store all of the items in an array and return the array so that I could access all of the items that I needed from the user but I was unable to make it happen.
	- I also tried breaking each item that I needed into its own method and I would call multiple methods but I was also having trouble getting that to work as well.
	- So I ended up repeating code which was not the goal.
- One problem that I ran into was knowing where to put everything I needed.
	- Once I figured out where it was supposed to go I had to work on knowing how to call that item from another location.
- I attempted adding a regular method to the CargoPlane class and tried calling just the one method without the interface and I was unable to get it to work.
- One of the big problems I had was understanding how to use the interface and instanceof
	
### Things I was unable to add or incorporate
- After doing the project I would have preferred to do test driven developement instead.
- The ability to land all airplanes
- Assign a pilot to an aircraft
- The ability to fly and land individual airplanes
- The ability to have a true dogfight where one airplane is the last one standing
