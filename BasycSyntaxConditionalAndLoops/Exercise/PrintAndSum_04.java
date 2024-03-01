package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDigit = Integer.parseInt(scanner.nextLine());
        int endDigit = Integer.parseInt(scanner.nextLine());
        int sumAllDigit = 0;
        for (int i = startDigit; i <=endDigit ; i++) {
            System.out.print(i + " ");
            sumAllDigit += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sumAllDigit);

    }
}
