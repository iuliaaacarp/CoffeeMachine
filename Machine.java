package machine;

import java.util.InputMismatchException;
import java.util.Scanner;

class Machine {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    int coffeesLeft = 10;

    public void makeCoffee(Coffee coffee){
        if (water < coffee.water){
            System.out.println("Sorry, not enough water!");
        }
        else if (milk < coffee.milk){
            System.out.println("Sorry, not enough milk!");
        }
        else if (beans < coffee.beans){
            System.out.println("Sorry, not enough beans!");
        }
        else if (cups == 0){
            System.out.println("Sorry, not enough cups!");
        }
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= coffee.water;
            milk -= coffee.milk;
            beans -= coffee.beans;
            cups -= 1;
            money += coffee.money;
            coffeesLeft -= 1;
        }
    }

    public void buyCoffee(Scanner input) {
        if (coffeesLeft == 0){
            System.out.println("I need cleaning!");
            return;
        }
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:  ");
        System.out.print("> ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                makeCoffee(Coffee.ESPRESSO);
                break;

            case "2":
                makeCoffee(Coffee.LATTE);
                break;

            case "3":
                makeCoffee(Coffee.CAPPUCCINO);
                break;

            case "back":
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public void fill(Scanner input){
        System.out.println("Write how many ml of water you want to add: ");
        System.out.print("> ");
        try {
            int waterI = input.nextInt();
            water += waterI;
        } catch (InputMismatchException e){
            System.out.println("Expecting an integer. Try again.");
        }

        System.out.println("Write how many ml of milkI you want to add: ");
        System.out.print("> ");
        try {
            int milkI = input.nextInt();
            milk += milkI;
        } catch (InputMismatchException e){
            System.out.println("Expecting an integer. Try again.");
        }

        System.out.println("Write how many grams of coffee beans you want to add: ");
        System.out.print("> ");
        try {
            int beansI = input.nextInt();
            beans += beansI;
        } catch (InputMismatchException e){
            System.out.println("Expecting an integer. Try again.");
        }

        System.out.println("Write how many disposable cups you want to add: ");
        System.out.print("> ");
        try {
            int cupsI = input.nextInt();
            cups += cupsI;
        } catch (InputMismatchException e){
            System.out.println("Expecting an integer. Try again.");
        }
    }

    public void printMachineData(){
        System.out.println("The coffee machine has:\n" + water +
                " ml of water\n" + milk +
                " ml of milk\n" +  beans +
                " g of coffee beans\n" + cups +
                " disposable cups\n" +
                "$" + money + " of money");
    }

    public void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void clean(){
        coffeesLeft = 10;
        System.out.println("I have been cleaned!");
    }
}
