package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        middlleChar(text);;
    }

    private static void middlleChar(String text) {
        if (text.length() % 2 == 0) {
            char symbol = text.charAt(text.length() / 2 - 1 );
            char symbolll = text.charAt(text.length() / 2);
            System.out.printf("%c%c",symbol,symbolll);
        } else {
            char symbol = text.charAt(text.length() / 2 );
            System.out.printf("%c",symbol);
        }
    }
}
