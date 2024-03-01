package TextProcessing.Exercise;

import java.util.Scanner;

public class RepleaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String text = scanner.nextLine();

             StringBuilder replaceText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
         char symbol = text.charAt(i);
         char lastSyymbol = text.charAt(text.length()-1);
         char secondLastsymbol = text.charAt(text.length()-2);
         if (i == text.length()-1) {
           if (lastSyymbol != secondLastsymbol) {
                replaceText.append(lastSyymbol);
           } else {
               replaceText.append(secondLastsymbol);
           }
         } else {
             char secondSymbol = text.charAt(i+1);
             if (symbol != secondSymbol) {
                 replaceText.append(symbol);
             }
         }
        }
        System.out.println(replaceText);

    }
}
