package TextProcessing.Excersieas;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split(", ");
        for (String word : text) {
            if (word.length() >= 3 && word.length() <= 16) {
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    char symbol = word.charAt(i);
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                        count++;
                    }
                } if (count == 0) {
                    System.out.println(word);
                }

            }
        }

    }
}
