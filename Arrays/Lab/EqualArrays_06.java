package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isNotIdentical = false;
         int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                isNotIdentical = true;
                break;
            }
            sum += firstArray[i];
        }
        if (!isNotIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
