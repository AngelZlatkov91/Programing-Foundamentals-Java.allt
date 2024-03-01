package ArraysListBasics;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNUmbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < digits.size()-1; i++) {
            double currentDigit = digits.get(i);

            if (currentDigit == digits.get(i+1)) {
                digits.remove(i+1);
                digits.set(i,currentDigit*2);
                i = -1;
            }
        }
        String output = "";
        for (double number : digits) {
            output += (new DecimalFormat("0.#").format(number)
            + " ");
        }
        System.out.print(output);





    }
}
