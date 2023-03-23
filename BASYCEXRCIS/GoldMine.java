package lab.ZADACHIOTIZPIT;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int lokacion = Integer.parseInt(scanner.nextLine());
       int days = 0;
       double averageGOld = 0;
        for (int i = 1; i <=lokacion ; i++) {
            double AverageGoldPerDay = Double.parseDouble(scanner.nextLine());
            int countDays = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= countDays ; j++) {
                double DaysGold = Double.parseDouble(scanner.nextLine());
                days = countDays;
                averageGOld += DaysGold;
            }
            averageGOld /= days;
             if (averageGOld >= AverageGoldPerDay) {
                 System.out.printf("Good job! Average gold per day: %.2f.%n", averageGOld);
                 days = 0;
                 averageGOld = 0;
             } else {
                 System.out.printf("You need %.2f gold. %n", AverageGoldPerDay - averageGOld);
                 days = 0;
                 averageGOld = 0;

             }


        }




    }
}
