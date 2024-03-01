package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        double firstSum = 1;
        double secondSum = 1;

        factorialDivision(firstDigit, secondDigit, firstSum, secondSum);

    }

    private static void factorialDivision(int firstDigit, int secondDigit, double firstSum, double secondSum) {
        for (int i = 1; i <= firstDigit; i++) {
                firstSum *= i;
        }

        for (int i = 1; i <= secondDigit; i++) {
                secondSum *= i;
        }

        System.out.printf("%.2f", firstSum / secondSum);
    }
}
