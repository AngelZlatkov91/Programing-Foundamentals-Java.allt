package ListArray;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < nums.size() - 1; i++) {
            double currentNum = nums.get(i);
            double currentNumTwo = nums.get(i + 1);
            if (currentNum == currentNumTwo){
                nums.set(i,currentNum + currentNumTwo);
                nums.remove(i+1);
                i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        String delimeter = " ";

        for (double digit : nums) {
            String num = df.format(digit) + delimeter;
            System.out.printf("%s", num);
        }


    }
}
