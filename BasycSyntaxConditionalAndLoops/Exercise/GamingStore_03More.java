package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class GamingStore_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
          boolean isOutOfMoney = false;
        double totalSpend = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            double currentPrice = 0;
            switch (input) {
                case "OutFall 4":
                    currentPrice = 39.99;
                    break;
                case "CS: OG":
                    currentPrice = 15.99;
                    break;
                case "Zplinter Zell":
                    currentPrice = 19.99;
                    break;
                case "Honored 2":
                    currentPrice = 59.99;
                    break;
                case "RoverWatch":
                    currentPrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    currentPrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance == 0) {
                isOutOfMoney = true;
                break;
            }
            if (currentPrice > currentBalance) {
                System.out.println("Too Expensive");
            } else {
                totalSpend += currentPrice;
                currentBalance -= currentPrice;
                System.out.println("Bought " + input);
            }
            input = scanner.nextLine();
        }
        if (isOutOfMoney) {
            System.out.println("Out of mo-ney!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend,currentBalance);
        }

    }
}
