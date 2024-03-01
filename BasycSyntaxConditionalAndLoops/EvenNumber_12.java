package BasycSyntaxConditionalAndLoops;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOdd = false;
        while (!isOdd) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                System.out.println("The number is: " + num);
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
