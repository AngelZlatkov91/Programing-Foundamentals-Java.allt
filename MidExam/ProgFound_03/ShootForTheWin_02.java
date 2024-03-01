package MidExam.ProgFound_03;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToInt(Integer::parseInt)
                 .toArray();
         int countShot =0;
         String input = scanner.nextLine();
         while (!input.equals("End")) {
             int index = Integer.parseInt(input);
             if (index>=0 && index<= numbers.length-1) {
                 int currentDigit = numbers[index];
                 if (currentDigit != -1) {
                     numbers[index] = -1;
                     countShot++;
                     for (int i = 0; i < numbers.length; i++) {
                         int num = numbers[i];
                         if (num != -1) {
                             if (num > currentDigit) {
                                 numbers[i] = num - currentDigit;
                             } else {
                                 numbers[i] = num + currentDigit;
                             }
                         }
                     }
                 }
             }

             input = scanner.nextLine();
         }
        System.out.print("Shot targets: " + countShot + " -> ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }






    }
}
