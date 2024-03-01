package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("swap")) {
                int oneIndex = Integer.parseInt(input.split(" ")[1]);
                int twoIndex = Integer.parseInt(input.split(" ")[2]);
                int oneDigit = numbers[oneIndex];
                int twoDigit = numbers[twoIndex];
                numbers[oneIndex] = twoDigit;
                numbers[twoIndex] = oneDigit;

            } else if (input.contains("multiply")) {
                int oneIndex = Integer.parseInt(input.split(" ")[1]);
                int twoIndex = Integer.parseInt(input.split(" ")[2]);
                int oneDigit = numbers[oneIndex];
                int twoDigit = numbers[twoIndex];
                numbers[oneIndex] = oneDigit * twoDigit;

            } else {
                for (int i = 0; i < numbers.length; i++) {
                    int currentNum = numbers[i];
                    numbers[i] = currentNum - 1;
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (i == numbers.length-1) {
                System.out.print(num);
            } else {
                System.out.print(num + ", ");
            }
        }


    }
}
