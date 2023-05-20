package TextProcessing.Excersieas;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            char neww = (char) (symbol + 3);
            cipher.append(neww);
        }
        System.out.println(cipher);
    }
}
