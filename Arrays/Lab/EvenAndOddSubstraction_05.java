package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOdd = 0 ;
        int evenSum = 0;
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            } else {
                sumOdd += currentDigit;
            }
        }

        System.out.println(evenSum - sumOdd);





    }
}
