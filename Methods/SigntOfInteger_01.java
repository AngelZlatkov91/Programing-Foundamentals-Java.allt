package Methods;

import java.util.Scanner;

public class SigntOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());

        signOfInteger(digit);

    }

    private static void signOfInteger(int digit) {
        if (digit > 0) {
            System.out.printf("The number %d is positive.", digit);
        } else if (digit < 0) {
            System.out.printf("The number %d is negative.", digit);
        } else {
            System.out.printf("The number %d is zero.", digit);
        }
    }
}
