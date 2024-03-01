package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());

         String [] redLine = new String[nLine];
         String [] blueLine = new String[nLine];
        for (int i = 1; i <= nLine; i++) {
            String [] currentDigits = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                blueLine[i-1] = currentDigits[0];
                redLine[i-1] = currentDigits[1];
            } else {
                blueLine[i-1] = currentDigits[1];
                redLine[i-1] = currentDigits[0];
            }
        }
        for (String redDigit : redLine) {
            System.out.print(redDigit + " ");

        }
        System.out.println();
        for (String blueDigit : blueLine) {
            System.out.print(blueDigit + " ");
        }




    }
}
