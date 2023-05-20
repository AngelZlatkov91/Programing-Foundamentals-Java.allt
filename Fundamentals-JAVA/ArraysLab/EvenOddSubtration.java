package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int odd = 0;
        int evem = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evem += num;
            } else {
                odd += num;
            }
        }
        int sum = evem - odd;
        System.out.println(sum);


    }
}
