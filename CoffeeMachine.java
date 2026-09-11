package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Machine machine = new Machine();

        boolean finished = false;
        while (!finished) {

            System.out.println("Write action (buy, fill, take, clean, remaining, exit): ");
            System.out.print("> ");
            Scanner input = new Scanner(System.in);
            String action = input.nextLine();

            if (action.equals("buy")) {
                machine.buyCoffee(input);
            } else if (action.equals("fill")) {
                machine.fill(input);
            } else if (action.equals("take")) {
                machine.take();
            } else if (action.equals("remaining")) {
                machine.printMachineData();
            } else if (action.equals("clean")) {
                machine.clean();
            }
            else if (action.equals("exit")) {
                finished = true;
                input.close();
            }
            else{
                System.out.println("Invalid action. Try again.");
            }
        }
    }
}