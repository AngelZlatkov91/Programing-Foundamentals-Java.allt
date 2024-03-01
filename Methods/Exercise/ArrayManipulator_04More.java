package Methods.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayManipulator_04More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input .equals("end")) {
            String[] commands = input.split(" ");
            if (input.contains("exchange")) {
                exchangeIndex(digits, commands);
            } else if (input.contains("max")){
                maxIndex(digits, input);
            } else if (input.contains("min")) {
                minIndex(digits, input);

            } else if (input.contains("first")) {
                firstDigits(digits, input, commands);

            } else if (input.contains("last")) {
                lastDigits(digits, input, commands);
            }
            input = scanner.nextLine();
        }

        System.out.println(digits);


    }

    private static void lastDigits(List<Integer> digits, String input, String[] commands) {
        int count = Integer.parseInt(commands[1]);
        if (count > digits.size()){
            System.out.println("Invalid count");
        } else {
            if (input.contains("even")) {
                int currentCountEven = 0;
                System.out.print("[");
                for (int i = digits.size()-1; i >=0; i--) {
                    int currentDigit = digits.get(i);
                    if (currentDigit % 2 == 0) {
                        System.out.print(currentDigit + ", ");
                        currentCountEven++;
                        if (currentCountEven == count){
                            break;
                        }
                    }
                }
                System.out.print("]");
                System.out.println();


            } else if (input.contains("odd")) {
                int currentCountOdd = 0;
                System.out.print("[");
                for (int i = digits.size()-1; i >=0; i--) {
                    int currentDigit = digits.get(i);
                    if (currentDigit % 2 != 0) {
                        System.out.print(currentDigit + ", ");
                        currentCountOdd++;
                        if (currentCountOdd == count){
                            break;
                        }
                    }
                }
                System.out.print("]");
                System.out.println();
            }

        }
    }

    private static void firstDigits(List<Integer> digits, String input, String[] commands) {
        int count = Integer.parseInt(commands[1]);
        if (count > digits.size()){
            System.out.println("Invalid count");
        } else {
            int currentCountEven = 0;
            if (input.contains("even")) {
                System.out.print("[");
                for (int i = 0; i < digits.size(); i++) {
                    int currentDigit = digits.get(i);
                    if (currentDigit % 2 == 0) {
                        System.out.print(currentDigit + ", ");
                          currentCountEven++;
                          if (currentCountEven == count){
                              break;
                          }
                    }
                }
                System.out.print("]");
                System.out.println();

            } else if (input.contains("odd")) {
                int currentCountOdd = 0;
                System.out.print("[");
                for (int i = 0; i < digits.size(); i++) {
                    int currentDigit = digits.get(i);
                    if (currentDigit % 2 != 0) {
                        System.out.print(currentDigit + ", ");
                        currentCountOdd++;
                        if (currentCountOdd == count){
                            break;
                        }

                    }
                }
                System.out.print("]");
                System.out.println();

            }
        }
    }

    private static void minIndex(List<Integer> digits, String input) {
        if (input.contains("even")){
            int minEvenDigit = Integer.MAX_VALUE;
            int index = 0;
            int count = 0;
            for (int i = 0; i < digits.size(); i++) {
                int currentDigit = digits.get(i);
                if (currentDigit % 2 == 0) {
                    if (minEvenDigit >= currentDigit) {
                        minEvenDigit = currentDigit;
                        index = i;
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        } else if (input.contains("odd")) {
            int minOddDigit = Integer.MAX_VALUE;
            int index = 0;
            int count = 0;
            for (int i = 0; i < digits.size(); i++) {
                int currentDigit = digits.get(i);
                if (currentDigit % 2 != 0) {
                    if (minOddDigit >= currentDigit) {
                        minOddDigit = currentDigit;
                        index = i;
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }
    }

    private static void maxIndex(List<Integer> digits, String input) {
        if (input.contains("even")){
            int maxEvenDigit = Integer.MIN_VALUE;
            int index = 0;
            int count = 0;
            for (int i = 0; i < digits.size(); i++) {
                int currentDigit = digits.get(i);
                if (currentDigit % 2 == 0) {
                  if (maxEvenDigit <= currentDigit) {
                      maxEvenDigit = currentDigit;
                      index = i;
                      count++;
                  }
                }
            }
            if (count == 0) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        } else if (input.contains("odd")) {
            int maxOddDigit = Integer.MIN_VALUE;
            int index = 0;
            int count = 0;
            for (int i = 0; i < digits.size(); i++) {
                int currentDigit = digits.get(i);
                if (currentDigit % 2 != 0) {
                    if (maxOddDigit <= currentDigit) {
                        maxOddDigit = currentDigit;
                        index = i;
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }
    }

    private static void exchangeIndex(List<Integer> digits, String[] commands) {
        int index = Integer.parseInt(commands[1]);
        if (index>=0 && index <= digits.size()-1) {
            for (int i = 0; i <=index ; i++) {
                int lastDigit = digits.get(digits.size()-1);
                digits.remove(digits.size()-1);
                digits.add(0,lastDigit);
            }
        } else {
            System.out.println("Invalid index");
        }
    }
}
