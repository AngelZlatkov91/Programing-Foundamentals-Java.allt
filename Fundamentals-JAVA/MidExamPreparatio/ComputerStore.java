package MidExamPreparatio;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("special")) {

            if (input.equals("regular")) {
                break;
            }
            double price = Double.parseDouble(input);
            if (price == 0) {
                System.out.println("Invalid order!");
            } else if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += price;
            }

            input = scanner.nextLine();
        }
        if (sum ==0) {
            System.out.println("Invalid order!");
        } else {
            double taxes = sum * 0.2;
            if (input.equals("special")) {
                double discount = (sum + taxes) - ((sum + taxes) * 0.1);
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n",sum);
                System.out.printf("Taxes: %.2f$%n",taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$",discount);
            } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n",sum);
                System.out.printf("Taxes: %.2f$%n",taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$",taxes + sum);
            }
        }






    }
}
