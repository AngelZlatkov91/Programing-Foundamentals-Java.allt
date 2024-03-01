package FinalExam.FinalExam_03;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String concealedMessage = scanner.nextLine();
         StringBuilder text = new StringBuilder(concealedMessage);

         String input = scanner.nextLine();
         while (!input.equals("Reveal")) {
             String[] tokens = input.split(":\\|:");
             if (tokens[0].equals("InsertSpace")) {
                 int index = Integer.parseInt(tokens[1]);
                 text.insert(index," ");
                 System.out.println(text);
             } else if (tokens[0].equals("Reverse")) {
                 String substring = tokens[1];
                 String subString = text.toString();
                 if (subString.contains(substring)) {
                     String reverse = "";
                     for (int i = substring.length()-1; i >=0 ; i--) {
                         char symbol = substring.charAt(i);
                         reverse += symbol;
                     }
                     subString = subString.replace(substring,"");
                     text = new StringBuilder(subString);
                     text.append(reverse);
                     System.out.println(text);

                 } else {
                     System.out.println("error");
                 }

             } else if (tokens[0].equals("ChangeAll")) {
                 String substring = tokens[1];
                 String replace = tokens[2];
                 String subText = text.toString();
                 int indexOf = subText.indexOf(substring);
                 while (indexOf != -1) {
                     subText = subText.replace(substring,replace);
                     indexOf = subText.indexOf(substring);
                 }
                 text = new StringBuilder(subText);
                 System.out.println(text);
             }
             input = scanner.nextLine();
         }
        System.out.println("You have a new text message: " + text);




    }
}
