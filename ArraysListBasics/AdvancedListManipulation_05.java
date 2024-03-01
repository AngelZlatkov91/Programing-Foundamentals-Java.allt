package ArraysListBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdvancedListManipulation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digitsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Contains")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                if (digitsList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (input.contains("Print")) {
                if (input.contains("even")) {
                    for (int evenDigit : digitsList) {
                        if (evenDigit % 2 == 0) {
                            System.out.print(evenDigit + " ");
                        }
                    }
                    System.out.println();
                } else {
                    for (int oddDigit : digitsList) {
                        if (oddDigit % 2 != 0) {
                            System.out.print(oddDigit + " ");
                        }
                    }
                    System.out.println();
                }
                
            } else if (input.contains("Get sum")) {
                int sum = 0;
                for (int getSum : digitsList) {
                    sum += getSum;
                }
                System.out.println(sum);
            } else if (input.contains("Filter")) {
                String condition = input.split(" ")[1];
                int number = Integer.parseInt(input.split(" ")[2]);
                if (condition.equals("<")) {
                    for (int digit : digitsList) {
                        if (digit < number) {
                            System.out.print(digit + " ");
                        }
                    }
                    System.out.println();

                } else if (condition.equals("<=")) {
                    for (int digit : digitsList) {
                        if (digit <= number) {
                            System.out.print(digit + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">")) {
                    for (int digit : digitsList) {
                        if (digit > number) {
                            System.out.print(digit + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">=")) {
                    for (int digit : digitsList) {
                        if (digit >= number) {
                            System.out.print(digit + " ");
                        }
                    }
                    System.out.println();
                }
            }
            input= scanner.nextLine();
        }
    }
}
