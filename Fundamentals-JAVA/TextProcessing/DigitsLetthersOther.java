package TextProcessing;

import java.util.Scanner;

public class DigitsLetthersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letther = new StringBuilder();
        StringBuilder others = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letther.append(symbol);
            } else {
                others.append(symbol);
            }

        }
        System.out.println(digit);
        System.out.println(letther);
        System.out.println(others);


    }
}
