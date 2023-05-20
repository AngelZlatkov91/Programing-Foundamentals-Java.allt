package ArraysLab.exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] textOne = scanner.nextLine().split(" ");
        String [] textTwo = scanner.nextLine().split(" ");
        for (int i = 0; i < textTwo.length; i++) {
            for (int j = 0; j < textOne.length; j++) {
                if (textTwo[i].equals(textOne[j])) {
                    System.out.print(textTwo[i] + " ");
                }
            }
        }



    }
}
