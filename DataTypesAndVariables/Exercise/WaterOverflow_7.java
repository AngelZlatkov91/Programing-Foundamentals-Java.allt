package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());

          int capacity = 255;
          int full = 0;
        for (int i = 1; i <=nLines ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                full += liters;
                capacity -= liters;
            }
        }
        System.out.println(full);

    }
}
