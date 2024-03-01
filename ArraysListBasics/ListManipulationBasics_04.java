package ArraysListBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Add")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                digits.add(number);
            } else if (input.contains("RemoveAt")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                digits.remove(index);
            } else if (input.contains("Remove")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                digits.remove(Integer.valueOf(num));
            } else if (input.contains("Insert")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                digits.add(index,number);
            }
            input = scanner.nextLine();
        }
        for (int num : digits) {
            System.out.print(num + " ");
        }


    }
}
