package ListArray.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Delete")) {
                int elementDelete = Integer.parseInt(input.split(" ")[1]);
                digits.removeAll(Collections.singleton(elementDelete));
            } else {
                int elementInsurt = Integer.parseInt(input.split(" ")[1]);
                int positionInsurt = Integer.parseInt(input.split(" ")[2]);
                digits.add(positionInsurt,elementInsurt);
            }
            input = scanner.nextLine();
        }

        for (int nums : digits) {
            System.out.print(nums + " ");
        }


    }
}
