package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thurDigit = Integer.parseInt(scanner.nextLine());
        int[] digits = new int[3];
        digits[0] = firstDigit;
        digits[1] = secondDigit;
        digits[2] = thurDigit;
        Arrays.sort(digits);
        for (int i = digits.length-1; i >=0 ; i--) {
            int num = digits[i];
            System.out.println(num);
        }






    }
}
