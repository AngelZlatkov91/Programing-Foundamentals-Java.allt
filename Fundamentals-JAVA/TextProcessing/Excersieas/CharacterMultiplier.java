package TextProcessing.Excersieas;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String firstWord = words[0];
        String secondWord = words[1];
        int sum = 0;
        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                int secondSymbol = secondWord.charAt(i);
                int firstSymbol = firstWord.charAt(i);
                sum +=(secondSymbol * firstSymbol);
            }
            for (int i = secondWord.length(); i < firstWord.length() ; i++) {
                int firstSymbol = firstWord.charAt(i);
                sum += firstSymbol;
            }

        } else if (secondWord.length() > firstWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                int secondSymbol = secondWord.charAt(i);
                int firstSymbol = firstWord.charAt(i);
                sum +=(secondSymbol * firstSymbol);
            }
            for (int i = firstWord.length(); i < secondWord.length() ; i++) {
                int firstSymbol = secondWord.charAt(i);
                sum += firstSymbol;
            }
        } else {
            for (int i = 0; i < firstWord.length(); i++) {
                int secondSymbol = secondWord.charAt(i);
                int firstSymbol = firstWord.charAt(i);
                sum +=(secondSymbol * firstSymbol);
            }
        }
        System.out.println(sum);

    }
}
