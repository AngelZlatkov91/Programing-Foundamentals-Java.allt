package FinalExam.FinalExam_05;
import java.util.Scanner;
public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String text = scanner.nextLine();
         StringBuilder keys = new StringBuilder(text);
         String input = scanner.nextLine();
         while (!input.equals("Generate")) {
             if (input.contains("Contains")) {
                 String substring = input.split(">>>")[1];
                 String toString = keys.toString();
                 if (toString.contains(substring)){
                     System.out.println(toString + " contains " + substring);
                 } else {
                     System.out.println("Substring not found!");
                 }
             } else if (input.contains("Flip")) {
                 String cases = input.split(">>>")[1];
                 int startIndex = Integer.parseInt(input.split(">>>")[2]);
                 int endIndex = Integer.parseInt(input.split(">>>")[3]);
                 String toString = keys.toString();
                 String word = "";
                 if (cases.equals("Upper")) {
                     for (int i = startIndex; i <endIndex ; i++) {
                         char newSymbol = toString.toUpperCase().charAt(i);
                         word+=newSymbol;
                     }
                 } else if (cases.equals("Lower")) {
                     for (int i = startIndex; i <endIndex ; i++) {
                         char newSymbol = toString.toLowerCase().charAt(i);
                         word+=newSymbol;
                     }
                 }
                 keys.replace(startIndex,endIndex,word);
                 System.out.println(keys);
             } else if (input.contains("Slice")) {
                 int startIndex = Integer.parseInt(input.split(">>>")[1]);
                 int endIndex = Integer.parseInt(input.split(">>>")[2]);
                 for (int i = startIndex; i <endIndex ; i++) {
                        keys.replace(startIndex,startIndex +1,"");
                 }
                 System.out.println(keys);
             }
             input = scanner.nextLine();
         }
        System.out.println("Your activation key is: " + keys);
    }
}
