package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String digit = scanner.nextLine();
        int[] strongDigit = Arrays.stream(digit.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int totalSum = 0;
        for (int i = 0; i < strongDigit.length; i++) {
            int factorialDigit = strongDigit[i];
            int currentSum = 1;
            for (int j = 1; j <= factorialDigit ; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }
        int currentNumber = Integer.parseInt(digit);
        if (totalSum == currentNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
