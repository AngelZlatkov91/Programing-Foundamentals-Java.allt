package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("END")) {
            reverseText(text);
            text = scanner.nextLine();
        }
    }

    private static void reverseText(String text) {
        String reverse = "";
        for (int i = text.length()-1; i >=0 ; i--) {
            char symbol = text.charAt(i);
            reverse += symbol;
        }
        if (text.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
