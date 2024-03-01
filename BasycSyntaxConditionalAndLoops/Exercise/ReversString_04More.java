package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class ReversString_04More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder reversText = new StringBuilder();
        for (int i = text.length()-1; i >= 0; i--) {
            char symbol = text.charAt(i);
            reversText.append(symbol);
        }
        System.out.println(reversText);
    }
}
