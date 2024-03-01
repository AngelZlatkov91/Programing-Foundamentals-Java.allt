package ArraysListBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

          digits.removeIf(n -> n<0);
        Collections.reverse(digits);
        if (digits.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(digits.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
