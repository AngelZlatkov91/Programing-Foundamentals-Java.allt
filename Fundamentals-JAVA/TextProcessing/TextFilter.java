package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] bannedWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : bannedWord) {
            String starsWord = "";
            for (int j = 0; j < banWord.length(); j++) {
                starsWord += "*";
            }
            text = text.replace(banWord, starsWord);
        }
        System.out.println(text);




    }
}
