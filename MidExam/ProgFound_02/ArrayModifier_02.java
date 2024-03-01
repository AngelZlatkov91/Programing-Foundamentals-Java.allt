package MidExam.ProgFound_02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")){
         if (input.contains("swap")) {
             int oneIndex = Integer.parseInt(input.split(" ")[1]);
             int twoIndex = Integer.parseInt(input.split(" ")[2]);
             int firstDigit = arrayNumbers[oneIndex];
             int secondDigit = arrayNumbers[twoIndex];
             arrayNumbers[oneIndex] = secondDigit;
             arrayNumbers[twoIndex] = firstDigit;
         } else if (input.contains("multiply")) {
             int oneIndex = Integer.parseInt(input.split(" ")[1]);
             int twoIndex = Integer.parseInt(input.split(" ")[2]);
             int firstDigit = arrayNumbers[oneIndex];
             int secondDigit = arrayNumbers[twoIndex];
             arrayNumbers[oneIndex] = firstDigit * secondDigit;
         } else if (input.contains("decrease")) {
             for (int i = 0; i < arrayNumbers.length; i++) {
                 int currentNum = arrayNumbers[i];
                 arrayNumbers[i] = currentNum - 1;
             }
         }
            input = scanner.nextLine();
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            int currentNum = arrayNumbers[i];
            if (i == arrayNumbers.length-1) {
                System.out.print(currentNum);
            }else {
                System.out.print(currentNum + ", ");
            }
        }
    }
}
