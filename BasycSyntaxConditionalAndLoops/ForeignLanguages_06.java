package BasycSyntaxConditionalAndLoops;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String language = scanner.nextLine();
       if (language.equals("England") || language.equals("USA")) {
           System.out.println("English");
       } else if (language.equals("Spain") || language.equals("Argentina") || language.equals("Mexico")) {
           System.out.println("Spain");
       } else {
           System.out.println("unknown");
       }
    }
}
