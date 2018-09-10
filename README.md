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
Be all classes are in the same package
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
	- The other option for the sub menu si to return to the main menu
- Option 8 will quit the program

After each menu or sub menu item is selected it will bring you back to the main menu. If an option is entered that is not available on the that menu you will be prompted again to make the correct selection.

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
- Stick to the UML. It is amazing at how easy it is to stray from the project where it will be more effiecent to stick with a plan and make the plan happen instead of the rabbit holes you can go into.
- One important thing is to keep on top of adding comments while you code so that you aren't trying to go back and add comments after all of the code is done.i

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
