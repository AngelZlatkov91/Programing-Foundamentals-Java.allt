package MidExam.ProgFound_02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

          double average = 0;
        for (int digit : numbers) {
            average += digit;
        }
        average = average / numbers.size();

        Collections.sort(numbers);
        int topFiveDigit =0;
        for (int i = numbers.size()-1; i >=0 ; i--) {
            int currentDigit = numbers.get(i);
            if (currentDigit > average) {
                System.out.print(currentDigit + " ");
                topFiveDigit++;
                if (topFiveDigit == 5) {
                    break;
                }
            }
        }
        if (topFiveDigit == 0) {
            System.out.println("No");
        }







    }
}
