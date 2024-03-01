package TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
          StringBuilder newText = new StringBuilder(text);
         int totalStrength = 0;
        for (int i = 0; i < newText.length(); i++) {
            char symbol = newText.charAt(i);
            if (symbol == '>') {
                int attackStrength = Integer.parseInt(newText.charAt(i+1) + "");
                totalStrength +=attackStrength;
            } else if (symbol != '>' && totalStrength >0) {
                newText.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(newText);
    }
}
