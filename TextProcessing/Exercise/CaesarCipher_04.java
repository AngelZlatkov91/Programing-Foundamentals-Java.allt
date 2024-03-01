package TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            char newSymbol = (char) (symbol + 3);
            cipher.append(newSymbol);
        }
        System.out.println(cipher);

    }
}
