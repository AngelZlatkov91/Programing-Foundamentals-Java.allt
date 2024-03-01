package FinalExam.FinalExam_04;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String passwordReset = scanner.nextLine();
       StringBuilder sb = new StringBuilder(passwordReset);


       String input = scanner.nextLine();
       while (!input.equals("Done")) {
           if (input.contains("TakeOdd")) {
               StringBuilder taleOdd= new StringBuilder();
               for (int i = 0; i < sb.length(); i++) {
                   char symbol = sb.charAt(i);
                   if (i % 2 != 0) {
                       taleOdd.append(symbol);
                   }
               }
               sb = taleOdd;
               System.out.println(sb);
           } else if (input.contains("Cut")) {
            int index = Integer.parseInt(input.split(" ")[1]);
            int length = Integer.parseInt(input.split(" ")[2]);
               for (int i = 1; i <=length ; i++) {
                   sb.replace(index,index+1,"");
               }
               System.out.println(sb);
           } else if (input.contains("Substitute")) {
              String substring = input.split(" ")[1];
              String substitute = input.split(" ")[2];
              int index = sb.indexOf(substring);


              if (index == -1) {
                  System.out.println("Nothing to replace!");
              } else {
                  while (index != -1) {
                     sb = sb.replace(index,index+1,"");
                     sb.insert(index,substitute);
                      index = sb.indexOf(substring);
                  }
                  System.out.println(sb);
              }
           }
           input = scanner.nextLine();
       }
        System.out.println("Your password is: " + sb);




    }
}
