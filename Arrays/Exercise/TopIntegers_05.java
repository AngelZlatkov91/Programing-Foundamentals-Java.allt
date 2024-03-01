package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length-1) {
                System.out.print(digits[digits.length-1]);
                break;
            }
            if (digits[i] > digits[i+1]) {
                System.out.print(digits[i] + " ");
            }
        }


    }
}
