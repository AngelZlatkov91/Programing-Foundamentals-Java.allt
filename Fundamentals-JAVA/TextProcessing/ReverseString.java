package TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("end")) {
            String reverse = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                char symbol = text.charAt(i);
                reverse += symbol;
            }
            System.out.println(text + " = " + reverse);

            text = scanner.nextLine();
        }
    }
}
