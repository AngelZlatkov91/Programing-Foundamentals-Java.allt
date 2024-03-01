package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] bannedWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : bannedWord) {
            String star = "";
            for (int i = 0; i < banWord.length(); i++) {
                star +="*";
            }
             text = text.replace(banWord,star);
        }
        System.out.println(text);
        
        
        
        
    }
}
