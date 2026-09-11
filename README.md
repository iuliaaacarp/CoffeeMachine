# Java Virtual Coffee Machine ☕

### Overview
*   This repository contains a console-based Java application that simulates the daily operations of a coffee machine.
*   Users can interact with the machine through a continuous command-line interface loop to purchase drinks, manage inventory, and perform routine machine maintenance.
*   `CoffeeMachine.java` handles the main loop.
*   `Machine.java` manages the inventory and brewing logic.
*   `Coffee.java` contains the exact drink definitions.

---

### Core Features
*   Interactive menu supporting `buy`, `fill`, `take`, `clean`, `remaining`, and `exit` commands[cite: 2].
*   Dynamic resource tracking for water, milk, coffee beans, disposable cups, and accumulated money[cite: 3].
*   A safety cleaning mechanism that stops purchases when zero coffees are left, requiring user maintenance[cite: 3].
*   Input handling that gracefully catches mismatch exceptions when users are restocking the machine[cite: 3].
*   Automated resource validation to ensure enough ingredients are present before brewing a beverage[cite: 3].

---

### Drink Menu 
The application supports a set menu of drinks with specific ingredient requirements. 

| Drink Type | Water (ml) | Milk (ml) | Beans (g) | Cost ($) | Source |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Espresso** | 250 | 0 | 16 | 4 |[cite: 1] |
| **Latte** | 350 | 75 | 20 | 7 |[cite: 1] |
| **Cappuccino** | 200 | 100 | 12 | 6 |[cite: 1] |

---

### Getting Started
To run this project locally, ensure you have the Java Development Kit (JDK) installed.
*   Open your terminal and navigate to the root directory containing your `machine` folder.
*   Compile the Java files by running: `javac machine/*.java`
*   Execute the main program by running: `java machine.CoffeeMachine`
