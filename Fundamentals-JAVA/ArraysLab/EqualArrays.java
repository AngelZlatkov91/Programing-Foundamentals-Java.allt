package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] oneArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] twoArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int index = 0;
        boolean notIdentical = false;
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] == twoArray[i]) {
                sum = sum + oneArray[i];
            } else {
                index = i;
                notIdentical = true;
                break;
            }

        }
        if(notIdentical) {
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        } else {
            System.out.println("Arrays are odentical. sum: " + sum);
        }

    }
}
