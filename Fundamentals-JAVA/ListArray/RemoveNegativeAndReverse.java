package ListArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            digits.removeIf(e -> e < 0);
        Collections.reverse(digits);

        if (digits.size() == 0){
            System.out.println("empty");
        } else {
            System.out.println(digits.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
