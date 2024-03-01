package FinalExam.FinalExam_03;

import java.util.Scanner;

public class SecretChar_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
           StringBuilder text = new StringBuilder(concealedMessage);
        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            if (input.contains("InsertSpace")) {
                int index = Integer.parseInt(input.split(":\\|:")[1]);
                text.insert(index, " ");
                System.out.println(text);
            } else if (input.contains("Reverse")) {
                String reverse = input.split(":\\|:")[1];
                int index = text.indexOf(reverse);
                if (index != -1) {
                    String newText = "";
                    for (int i = reverse.length()-1; i >=0 ; i--) {
                        char symbol = reverse.charAt(i);
                        newText += symbol;
                    }
                    int lastIndex = reverse.length();
                    for (int i = 0; i <lastIndex ; i++) {
                        text.replace(index,index+1,"");
                    }
                    text.insert(index,newText);
                    System.out.println(text);
                } else {
                    System.out.println("error");
                }
            } else if (input.contains("ChangeAll")) {
                String sybString = input.split(":\\|:")[1];
                String replacement = input.split(":\\|:")[2];
                int index= text.indexOf(sybString);
                int lastIndex = sybString.length();
                if (index != -1) {
                    while (index != -1) {
                        for (int i = 0; i < lastIndex; i++) {
                            text.replace(index, index + 1, "");
                        }
                        text.insert(index, replacement);
                        index = text.indexOf(sybString);
                    }
                    System.out.println(text);
                } else {
                    System.out.println("error");
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + text);
    }
}
