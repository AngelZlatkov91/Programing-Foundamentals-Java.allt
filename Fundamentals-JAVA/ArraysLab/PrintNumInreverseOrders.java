package ArraysLab;

import java.util.Scanner;

public class PrintNumInreverseOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] reversNum = new int[n];
        for (int i = 0; i <n ; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            reversNum[i] = nums;
        }
        for (int i = reversNum.length-1; i >=0 ; i--) {
            System.out.printf("%d ",reversNum[i]);
        }




    }
}
