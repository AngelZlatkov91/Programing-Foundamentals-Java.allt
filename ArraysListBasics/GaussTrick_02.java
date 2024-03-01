package ArraysListBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sizeList = digits.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int lastDigit = digits.get(digits.size() - 1);
            int iDigit = digits.get(i);
            digits.remove(digits.size()-1);
            digits.set(i,lastDigit + iDigit);
        }
        for (int num  : digits) {
            System.out.print(num + " ");
        }




    }
}
