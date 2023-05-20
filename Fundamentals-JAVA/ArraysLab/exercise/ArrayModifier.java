package ArraysLab.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String command = input.split(" ")[0];
            switch (command){
                case "swap":
                    int firstIndex = Integer.parseInt(input.split(" ")[1]);
                    int secondIndex = Integer.parseInt(input.split(" ")[2]);
                    int swapIndexOne = numbers[firstIndex];
                    int swapIndexTwo = numbers[secondIndex];
                    numbers[firstIndex] = swapIndexTwo;
                    numbers[secondIndex] = swapIndexOne;
                     break;
                case "multiply":
                    int firstMultiIndex = Integer.parseInt(input.split(" ")[1]);
                    int secondMultiIndex = Integer.parseInt(input.split(" ")[2]);
                    int multiIndexOne = numbers[firstMultiIndex];
                    int multiIndexTwo = numbers[secondMultiIndex];
                     numbers[firstMultiIndex] = multiIndexOne * multiIndexTwo;
                     break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        int digit = numbers[i];
                        digit--;
                        numbers[i] = digit;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (i == numbers.length-1){
                System.out.print(num);
            } else {
                System.out.print(num + ", ");
            }
        }




    }
}
