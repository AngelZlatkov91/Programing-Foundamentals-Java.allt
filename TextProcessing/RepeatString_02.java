package TextProcessing;

import java.util.Scanner;

public class RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        for (String word : text) {
            System.out.print(word.repeat(word.length()));
        }




    }
}
