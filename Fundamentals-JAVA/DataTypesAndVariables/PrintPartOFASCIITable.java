package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOFASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDigit = Integer.parseInt(scanner.nextLine());
        int endDigit = Integer.parseInt(scanner.nextLine());

        for (int i = startDigit; i <=endDigit ; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }


    }
}
