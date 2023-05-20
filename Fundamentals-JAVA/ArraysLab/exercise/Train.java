package ArraysLab.exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] wagons = new int[n];
        for (int i = 0; i <n ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            wagons[i] = people;
        }
        for (int nums : wagons) {
            System.out.print(nums + " ");
            System.out.println();
        }
        System.out.println(sum);

    }
}
