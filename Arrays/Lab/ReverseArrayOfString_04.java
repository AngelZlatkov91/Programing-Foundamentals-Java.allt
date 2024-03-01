package Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split(" ");
        for (int i = 0; i < text.length / 2; i++) {
            String olElement = text[i];
            text[i] = text[text.length-1 - i];
            text[text.length-1-i] = olElement;
        }
        System.out.print(String.join(" ",text));


    }
}
