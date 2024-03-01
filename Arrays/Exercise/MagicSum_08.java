package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < digits.length ; i++) {
            for (int j = i+1; j < digits.length; j++) {
                if (digits[i] + digits[j] == magicNum) {
                    System.out.println(digits[i] + " " + digits[j]);
                }
            }
        }
    }
}
