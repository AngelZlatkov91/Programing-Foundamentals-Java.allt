package MidExamPreparatio;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class Probelm3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
          int counter = 0;
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        sum = sum / numbers.length;
        List<Integer> digits = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n > sum) {
                counter++;
                digits.add(n);
            }
        }
        Collections.sort(digits);

         int count = 0;
         if (counter ==0) {
             System.out.println("No");
         } else {
             for (int i = digits.size() - 1; i >=0; i--) {
                 int dig = digits.get(i);
                 if (count == 5) {
                     break;
                 } else {
                     count++;
                     System.out.print(dig + " ");
                 }

             }
         }










    }
}
