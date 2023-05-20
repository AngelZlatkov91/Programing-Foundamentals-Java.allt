package ListArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gausstrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digit = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
             int sizeList = digit.size();
        for (int i = 0; i < sizeList / 2; i++) {
            int firstDigit = digit.get(i);
            int secondDigit = digit.get(digit.size()-1);
            digit.set(i,firstDigit + secondDigit);
            digit.remove(digit.size()-1);
        }

        for (int nums : digit) {
            System.out.print(nums + " ");
        }






    }
}
