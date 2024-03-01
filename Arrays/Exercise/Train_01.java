package Arrays.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());

        int[] train = new int[nLine];
          int sum = 0;

        for (int i = 0; i <nLine ; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            sum += peopleInWagon;
            train[i] = peopleInWagon;
        }
        for (int wagons : train) {
            System.out.print(wagons + " ");
        }
        System.out.println();
        System.out.println(sum);




    }
}
