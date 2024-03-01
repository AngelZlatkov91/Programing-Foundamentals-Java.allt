package FinalExam.FinalExam_01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String encryptText = scanner.nextLine();
         StringBuilder text = new StringBuilder(encryptText);

         String input = scanner.nextLine();
         while (!input.equals("Decode")) {
             String [] tokens = input.split("\\|");
             if (tokens[0].equals("Move")) {
                 int numberOfLetters = Integer.parseInt(tokens[1]);
                 String letters = text.substring(0,numberOfLetters);
                 text.replace(0,numberOfLetters,"");
                 text.append(letters);
             } else if (tokens[0].equals("Insert")) {
                 int index = Integer.parseInt(tokens[1]);
                 String value = (tokens[2]);
                 text.insert(index,value);
             } else if (tokens[0].equals("ChangeAll")) {
                 String substring  = (tokens[1]);
                 String replace  = (tokens[2]);
                 String subText = text.toString();
                subText = subText.replace(substring,replace);
                text = new StringBuilder(subText);
             }
             input = scanner.nextLine();
         }

        System.out.println("The decrypted message is: " + text);



    }
}
