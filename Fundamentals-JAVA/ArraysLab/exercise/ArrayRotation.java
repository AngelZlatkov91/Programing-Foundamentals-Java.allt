package ArraysLab.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            int firstDigit = nums[0];
            for (int j = 0; j < nums.length -1 ; j++) {
                nums[j]= nums[j + 1];
            }

            nums[nums.length-1] = firstDigit;
        }
        for (int digits : nums) {
            System.out.print(digits + " ");
        }



    }
}
