package lab.ZADACHIOTIZPIT;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String moont = scanner.nextLine();
         int hours = Integer.parseInt(scanner.nextLine());
         int people = Integer.parseInt(scanner.nextLine());
          String timeOfDay = scanner.nextLine();
        double priceForHOur = 0;
        double total = 0;
        if (timeOfDay.equals("day")){
            switch (moont){
                case "march":
                case "april":
                case "may":
                    priceForHOur += 10.50;
                    break;
                case "june":
                case "july":
                case "august":
                    priceForHOur += 12.60;
                    break;
            }

        } else {
            switch (moont){
                case "march":
                case "april":
                case "may":
                    priceForHOur += 8.40;
                    break;
                case "june":
                case "july":
                case "august":
                    priceForHOur += 10.20;
                    break;
            }

        }
        if (people >= 4){
            priceForHOur = priceForHOur - (priceForHOur * 0.1);
        }
        if (hours >= 5){
            priceForHOur /= 2;
        }
        total = (priceForHOur * people) * hours;

        System.out.printf("Price per person for one hour: %.2f%n", priceForHOur);
        System.out.printf("Total cost of the visit: %.2f", total);



    }
}
