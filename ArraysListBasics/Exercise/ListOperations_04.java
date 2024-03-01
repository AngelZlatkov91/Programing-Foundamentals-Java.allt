package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digitsOperation = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.contains("Add")) {
                int addNumber = Integer.parseInt(input.split(" ")[1]);
                digitsOperation.add(addNumber);
            } else if (input.contains("Insert")) {
                int insertNumber = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                if (index<0 || index> digitsOperation.size()-1) {
                    System.out.println("Invalid index");
                } else {
                    digitsOperation.add(index,insertNumber);
                }
            } else if (input.contains("Remove")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index<0 || index> digitsOperation.size()-1) {
                    System.out.println("Invalid index");
                } else {
                    digitsOperation.remove(index);
                }
            } else if (input.contains("Shift left")) {
                int count = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <=count; i++) {
                    int firstDigit = digitsOperation.get(0);
                    digitsOperation.remove(0);
                    digitsOperation.add(firstDigit);
                }
            } else if (input.contains("Shift right")) {
                int count = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <=count; i++) {
                    int lastDigit = digitsOperation.get(digitsOperation.size()-1);
                    digitsOperation.remove(digitsOperation.size()-1);
                    digitsOperation.add(0,lastDigit);
                }
            }
            input = scanner.nextLine();
        }

        System.out.print(digitsOperation.toString().replaceAll("[\\[\\],]", ""));

    }
}
