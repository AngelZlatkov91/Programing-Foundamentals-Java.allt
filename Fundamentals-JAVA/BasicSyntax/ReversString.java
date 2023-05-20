package BasicSyntax;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder textrevers = new StringBuilder();
        for (int i = text.length()-1; i >=0 ; i--) {
            char symbol = text.charAt(i);
            textrevers.append(symbol);
        }
        System.out.println(textrevers);
    }
}
