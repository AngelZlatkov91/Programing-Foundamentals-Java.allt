package ListArray.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.contains("Add")) {
                int addNumber = Integer.parseInt(input.split(" ")[1]);
                digits.add(addNumber);
            } else if (input.contains("Remove")) {
                int removeNumber = Integer.parseInt(input.split(" ")[1]);
                if (removeNumber >= 0 && removeNumber <= digits.size()-1) {
                    digits.remove(removeNumber);
                } else {
                    System.out.println("Invalid index");

                }
            } else if (input.contains("Insert")) {
                int insertNumber = Integer.parseInt(input.split(" ")[1]);
                int indexNumber = Integer.parseInt(input.split(" ")[2]);
                if (indexNumber >= 0 && indexNumber <= digits.size()-1) {
                    digits.add(indexNumber,insertNumber);

                } else {
                    System.out.println("Invalid index");
                }

            } else if (input.contains("left")) {
                int countTimes = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <=countTimes ; i++) {
                    int firstNum = digits.get(0);
                    digits.remove(0);
                    digits.add(firstNum);
                }

            } else if (input.contains("right")) {
                int countTimes = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <=countTimes ; i++) {
                    int lastNum = digits.get(digits.size()-1);
                    digits.remove(digits.size()-1);
                    digits.add(0,lastNum);
                }
            }

            input = scanner.nextLine();
        }

        for (int result : digits) {
            System.out.print(result + " ");
        }
        
        
        
    }
}
