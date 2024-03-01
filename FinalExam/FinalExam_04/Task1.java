package FinalExam.FinalExam_04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String password = scanner.nextLine();
         StringBuilder sb = new StringBuilder(password);

         String input = scanner.nextLine();
         while (!input.equals("Done")) {
             String [] tokens = input.split(" ");
             if (tokens[0].equals("TakeOdd")) {
                 StringBuilder text = new StringBuilder();
                 for (int i = 0; i < sb.length(); i++) {
                     if ((i+1) % 2 == 0){
                         char symbol = sb.charAt(i);
                         text.append(symbol);
                     }
                 }
                 sb = text;
                 System.out.println(sb);
                 
             } else if (tokens[0].equals("Cut")) {
                 int index = Integer.parseInt(tokens[1]);
                 int length = Integer.parseInt(tokens[2]);
                 for (int i = 0; i < length; i++) {
                     sb.replace(index,index+1,"");
                 }
                 System.out.println(sb);

             } else if (tokens[0].equals("Substitute")) {
                 String substring = tokens[1];
                 String subStitute = tokens[2];
                 int index = sb.indexOf(substring);
                 if (index == -1) {
                     System.out.println("Nothing to replace!");
                 } else {
                     while (index != -1) {
                        sb.replace(index,index+substring.length(),"");
                         sb.insert(index,subStitute);
                         index = sb.indexOf(substring);
                     }
                     System.out.println(sb);
                     }

                 }
             input = scanner.nextLine();
             }

        System.out.print("Your password is: " + sb);


    }
}
