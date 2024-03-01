package Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int nLine = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=nLine ; i++) {
            int currentDigit = digits.get(0);
            digits.remove(0);
            digits.add(currentDigit);
        }
        for (int numbers : digits) {
            System.out.print(numbers + " ");
        }








    }
}
