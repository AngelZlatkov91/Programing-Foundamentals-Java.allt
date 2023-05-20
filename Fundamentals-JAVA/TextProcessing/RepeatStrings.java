package TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split("\\s+");
         StringBuilder repeatString = new StringBuilder();
        for (String word : text) {
            for (int i = 0; i < word.length(); i++) {
                repeatString.append(word);
            }
            //vtori variant samo s print i repeat
           // System.out.print(word.repeat(word.length()));
        }
        //System.out.println();
        System.out.println(repeatString);




    }
}
