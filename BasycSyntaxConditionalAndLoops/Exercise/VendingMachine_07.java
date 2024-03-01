package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allCoins = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                allCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }

            input = scanner.nextLine();
        }

        String purchaInput = scanner.nextLine();
        while (!purchaInput.equals("End")) {
            if (purchaInput.equals("Nuts")) {
                if (allCoins < 2) {
                    System.out.println("Sorry, not enough money");
                } else {
                    allCoins -= 2;
                    System.out.println("Purchased Nuts");
                }
            } else if (purchaInput.equals("Water")) {
                if (allCoins < 0.7) {
                    System.out.println("Sorry, not enough money");
                } else {
                    allCoins -= 0.7;
                    System.out.println("Purchased Water");
                }
            } else if (purchaInput.equals("Crisps")) {
                if (allCoins < 1.5) {
                    System.out.println("Sorry, not enough money");
                } else {
                    allCoins -= 1.5;
                    System.out.println("Purchased Crisps");
                }
            } else if (purchaInput.equals("Soda")) {
                if (allCoins < 0.8) {
                    System.out.println("Sorry, not enough money");
                } else {
                    allCoins -= 0.8;
                    System.out.println("Purchased Soda");
                }
            } else if (purchaInput.equals("Coke")) {
                if (allCoins < 1) {
                    System.out.println("Sorry, not enough money");
                } else {
                    allCoins -= 1;
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");
            }

            purchaInput = scanner.nextLine();
        }

        System.out.printf("Change: %.2f",allCoins);



    }
}
