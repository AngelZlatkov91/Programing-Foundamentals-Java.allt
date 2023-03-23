package lab.ZADACHIOTIZPIT;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int foodKG = Integer.parseInt(scanner.nextLine());
       int gramsFood = foodKG * 1000;
       int gramsAll = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")){
            int grams = Integer.parseInt(input);
            gramsAll += grams;

            input = scanner.nextLine();
        }
        if (gramsAll <= gramsFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", gramsFood - gramsAll);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", gramsAll - gramsFood);
        }




    }
}
