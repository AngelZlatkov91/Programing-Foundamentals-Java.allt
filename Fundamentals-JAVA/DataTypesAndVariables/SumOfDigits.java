package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (nums > 0) {
            sum = sum + (nums % 10);
            nums = nums / 10;
        }
        System.out.println(sum);
    }
}
