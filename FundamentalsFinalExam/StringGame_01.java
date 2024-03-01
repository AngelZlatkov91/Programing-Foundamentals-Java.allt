package FundamentalsFinalExam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Change")) {
                String symbol = tokens[1];
                String replace = tokens[2];
                String toString = textBuilder.toString();
                int indexOf = toString.indexOf(symbol);
                while (indexOf != -1) {
                    toString = toString.replace(symbol,replace);
                    indexOf = toString.indexOf(symbol);
                }
                textBuilder = new StringBuilder(toString);
                System.out.println(textBuilder);

            } else if (tokens[0].equals("Includes")) {
                String subString = tokens[1];
                String toString = textBuilder.toString();
                if (toString.contains(subString)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (tokens[0].equals("End")) {
                String subString = tokens[1];
                int lent = subString.length();
                int lentText = textBuilder.length();
                String toString = textBuilder.toString();
                String endText = toString.substring(lentText-lent,lentText);
                if (subString.equals(endText)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (tokens[0].equals("Uppercase")) {
                String toString = textBuilder.toString().toUpperCase();
                textBuilder = new StringBuilder(toString);
                System.out.println(textBuilder);

            } else if (tokens[0].equals("FindIndex")) {
                String subString = tokens[1];
                int findIndex = textBuilder.indexOf(subString);
                System.out.println(findIndex);
            } else if (tokens[0].equals("Cut")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int count = Integer.parseInt(tokens[2]);
                String cutChars = textBuilder.substring(startIndex,startIndex + count);
                textBuilder = new StringBuilder(cutChars);
                System.out.println(textBuilder);
            }
            input = scanner.nextLine();
        }








    }
}
