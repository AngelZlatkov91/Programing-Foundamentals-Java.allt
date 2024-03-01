package ArraysListBasics.Exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int [] bombNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bombDigit = bombNumbers[0];
        int powerDigit = bombNumbers[1];

        while (digits.contains(bombDigit)) {
            int elementIndex = digits.indexOf(bombDigit);
            int left =Math.max(0,elementIndex - powerDigit);
            int right = Math.min(elementIndex + powerDigit,digits.size()-1);

            for (int i = right; i >= left ; i--) {
                digits.remove(i);
            }
        }
        int sum = 0;
        for (int num : digits) {
            sum+=num;
        }
        System.out.println(sum);




    }
}
