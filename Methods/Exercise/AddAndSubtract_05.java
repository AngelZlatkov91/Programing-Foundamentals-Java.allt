package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int turd = Integer.parseInt(scanner.nextLine());

        int sum = getSum(first, second);
        System.out.println(subtract(sum,turd));
    }

    private static int subtract(int turd, int sum) {
        return turd - sum;
    }

    private static int getSum(int first, int second) {
        return first + second;
    }
}
