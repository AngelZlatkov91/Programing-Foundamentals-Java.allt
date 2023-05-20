package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
         int full = 0;

        for (int i = 1; i <= count ; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if ((full + litters) > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                full += litters;
            }
        }
        System.out.println(full);
    }
}
