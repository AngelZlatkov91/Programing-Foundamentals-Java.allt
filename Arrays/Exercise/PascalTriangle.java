package Arrays.Exercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=nLine ; i++) {
            for (int j = i; j <=i; j++) {
                int [] numbers = new int[i];
                numbers[0] = 1;
                numbers[numbers.length-1] = 1;

            }
            System.out.println();
        }



    }
}
