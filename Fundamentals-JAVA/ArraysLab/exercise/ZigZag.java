package ArraysLab.exercise;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] red = new int[n];
        int [] blue = new int[n];
        for (int i = 1; i <=n ; i++) {
            String numbers = scanner.nextLine();
            int firstNum = Integer.parseInt(numbers.split(" ")[0]);
            int secondNum = Integer.parseInt(numbers.split(" ")[1]);
            if (i % 2 ==0) {
                blue[i-1] = firstNum;
                red[i-1] = secondNum;
            } else {
                red[i-1] = firstNum;
                blue[i-1] = secondNum;
            }
        }
        for (int redd : red) {
            System.out.print(redd + " ");
        }
        System.out.println();
        for (int bluee : blue) {
            System.out.print(bluee + " ");
        }
    }
}
