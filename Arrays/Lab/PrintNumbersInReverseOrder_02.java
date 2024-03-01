package Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
          int [] numberArr = new int[nLine];
        for (int i = 0; i <nLine ; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            numberArr [i] = digit;
        }
        for (int i = numberArr.length - 1; i >=0 ; i--) {
            System.out.print(numberArr[i] + " ");
        }



    }
}
