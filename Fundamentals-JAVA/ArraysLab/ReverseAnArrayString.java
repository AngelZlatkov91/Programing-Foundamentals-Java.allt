package ArraysLab;

import java.util.Scanner;

public class ReverseAnArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        for (int i = 0; i < text.length / 2; i++) {
            String oldElement = text[i];
            text[i] = text[text.length-1 - i];
           text[text.length-1-i] = oldElement;

        }
        System.out.println(String.join(" ",text));

    }
}
