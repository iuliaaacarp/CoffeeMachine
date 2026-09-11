# CoffeeMachine
Overview
This repository contains a console-based Java application that simulates the daily operations of a coffee machine. Users can interact with the machine through a continuous command-line interface loop to purchase drinks, manage inventory, and perform routine machine maintenance. The logic is divided across three main files: CoffeeMachine.java for the main loop, Machine.java for the inventory and brewing logic, and Coffee.java for the exact drink definitions.  
JAVA
+ 3
Core Features
Interactive menu supporting buy, fill, take, clean, remaining, and exit commands.  
JAVA
Dynamic resource tracking for water, milk, coffee beans, disposable cups, and accumulated money.  
JAVA
A safety cleaning mechanism that stops purchases when zero coffees are left, requiring user maintenance.  
JAVA
Input handling that gracefully catches mismatch exceptions when users are restocking the machine.  
JAVA
Automated resource validation to ensure enough ingredients are present before brewing a beverage.  
JAVA
Drink Menu
The application supports a set menu of drinks with specific ingredient requirements.
Drink Type	Water (ml)	Milk (ml)	Beans (g)	Cost ($)	Source
Espresso	250	0	16	4	
Latte	350	75	20	7	
Cappuccino	200	100	12	6	
  
JAVA
+ 2
Getting Started
To run this project locally, ensure you have the Java Development Kit (JDK) installed.
Open your terminal and navigate to the root directory containing your machine folder.
Compile the Java files by running: javac machine/*.java
Execute the main program by running: java machine.CoffeeMachine
