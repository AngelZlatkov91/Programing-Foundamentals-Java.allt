package Arrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int digit = 0;
        int maxSequence = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < elements.length-1; i++) {

            if (elements[i] == elements[i+1]) {
                count++;
                if (count > maxSequence) {
                    maxSequence = count;
                    digit = elements[i];
                }
            } else {
                count =0;
            }

        }
        for (int i = 1; i <=maxSequence+1 ; i++) {
            System.out.print(digit + " ");
        }



    }
}
