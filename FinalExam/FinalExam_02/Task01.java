package FinalExam.FinalExam_02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String destination = scanner.nextLine();
      StringBuilder text = new StringBuilder(destination);

     String input = scanner.nextLine();
     while (!input.equals("Travel")) {
         String [] tokens = input.split(":");
         if (tokens[0].equals("Add Stop")) {
             int index = Integer.parseInt(tokens[1]);
             String insertText = tokens[2];
             if (index >=0 && index <= text.length()-1) {
                 text.insert(index, insertText);
                 System.out.println(text);
             }
             
         } else if (tokens[0].equals("Remove Stop")) {
             int startIndex = Integer.parseInt(tokens[1]);
             int endIndex = Integer.parseInt(tokens[2]);
             if (startIndex >=0  && endIndex <= text.length()-1) {
                 for (int i = startIndex; i <=endIndex ; i++) {
                     text.replace(startIndex,startIndex+1, "");
                 }

                 System.out.println(text);
             }

         } else if (tokens[0].equals("Switch")) {
             String oldString = tokens[1];
             String newString = tokens[2];
             String toString = text.toString();
                 toString = toString.replace(oldString, newString);
                 text = new StringBuilder(toString);
                 System.out.println(text);

         }
         input = scanner.nextLine();
     }
        System.out.println("Ready for world tour! Planned stops: " + text);





    }
}
