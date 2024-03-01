package FinalExam.FinalExam_05;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
          StringBuilder sb = new StringBuilder(key);
        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String [] tokens = input.split(">>>");
            if (tokens[0].equals("Contains")) {
                String substring = tokens[1];
                String toString = sb.toString();
                if (toString.contains(substring)) {
                    System.out.println(toString + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }
                
            } else if (tokens[0].equals("Flip")) {
                String tape = tokens[1];
                int startIndex = Integer.parseInt(tokens[2]);
                int endIndex = Integer.parseInt(tokens[3]);
                 String text = "";
                if (tape.equals("Upper")) {
                    for (int i = startIndex; i <endIndex ; i++) {
                        char symbol = sb.toString().toUpperCase().charAt(i);
                        text += symbol;
                    }
                } else {
                    for (int i = startIndex; i <endIndex ; i++) {
                        char symbol = sb.toString().toLowerCase().charAt(i);
                        text += symbol;
                    }
                }
                sb.replace(startIndex,endIndex,text);
                System.out.println(sb);
                
            } else if (tokens[0].equals("Slice")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                sb.replace(startIndex,endIndex,"");
                System.out.println(sb);
            }


            input = scanner.nextLine();
        }
        System.out.println("Your activation key is : " + sb);



    }
}
