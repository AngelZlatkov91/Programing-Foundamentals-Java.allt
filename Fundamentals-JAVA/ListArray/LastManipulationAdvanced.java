package ListArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] command = input.split(" ");
            if (command[0].equals("Contains")) {
                int containNum = Integer.parseInt(command[1]);
                if (digits.contains(containNum)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command[1].equals("even")) {
                for (int num : digits) {
                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            } else if (command[1].equals("odd")) {
                for (int num : digits) {
                    if (num % 2 != 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            } else if (command[0].equals("Get")) {
                int sum = 0;
                for (int num  : digits) {
                    sum += num;
                }
                System.out.println(sum);
            } else if (command[0].equals("Filter")) {
                String condition = command[1];
                switch (condition) {
                    case "<":
                        int num = Integer.parseInt(command[2]);
                        for (int n : digits) {
                            if (n < num) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        int nums = Integer.parseInt(command[2]);
                        for (int n : digits) {
                            if (n <= nums) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">":
                        int numss = Integer.parseInt(command[2]);
                        for (int n : digits) {
                            if (n > numss) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        int numsss = Integer.parseInt(command[2]);
                        for (int n : digits) {
                            if (n >= numsss) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                }
            }
            input = scanner.nextLine();
        }
    }
}
