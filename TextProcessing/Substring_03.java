package TextProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeString = scanner.nextLine();
        String text = scanner.nextLine();
        int index = text.indexOf(removeString);
        while (index != -1) {
           text = text.replace(removeString, "");
           index = text.indexOf(removeString);
        }
        System.out.println(text);


    }
}
