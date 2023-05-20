package TextProcessing.Excersieas;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            char lastSymbol = text.charAt(text.length()-1);
            char secondlastSym = text.charAt(text.length()-2);
            if (i == text.length()-1) {
                if (lastSymbol != secondlastSym) {
                    newText.append(lastSymbol);
                } else {
                    newText.append(secondlastSym);
                }
            } else {
                char seconSymbol = text.charAt(i +1);
                if (symbol != seconSymbol) {
                    newText.append(symbol);
                }
            }
        }

        System.out.println(newText);




    }
}
