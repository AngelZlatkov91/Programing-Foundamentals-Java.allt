package DataTypesAndVariables.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] digits = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int num : digits) {
            sum += num;
        }
        System.out.println(sum);
    }
}
