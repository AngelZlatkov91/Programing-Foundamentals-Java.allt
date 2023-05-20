package ArraysLab.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nums.length; i++) {
            int curentNum = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int inNumber = nums[j];
                if (curentNum + inNumber == magicSum){
                    System.out.println(curentNum + " " + inNumber);
                }
            }
        }

    }
}
