package Arrays.Lab;


import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumOfAllDigitInArray = 0;

        for (int number : digits) {
            if (number % 2 == 0) {
                sumOfAllDigitInArray += number;
            }
        }
        System.out.println(sumOfAllDigitInArray);




    }
}
