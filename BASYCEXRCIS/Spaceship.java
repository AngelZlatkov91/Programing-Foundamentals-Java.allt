package lab.ZADACHIOTIZPIT;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double bigShip = Double.parseDouble(scanner.nextLine());
         double lOngShip = Double.parseDouble(scanner.nextLine());
         double highShip = Double.parseDouble(scanner.nextLine());
         double highAstronavt = Double.parseDouble(scanner.nextLine());
         double cubikROkets = bigShip * lOngShip * highShip;
         double rooms = (highAstronavt + 0.4) * 2 * 2;
         double place = Math.floor(cubikROkets / rooms);

         if (place < 3) {
             System.out.println("The spacecraft is too small.");
         } else if (place <= 10) {
             System.out.printf("The spacecraft holds %.0f astronauts.", place);
         }else {
             System.out.println("The spacecraft is too big.");
         }


    }
}
