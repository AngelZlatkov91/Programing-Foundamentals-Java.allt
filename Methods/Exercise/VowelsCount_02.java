package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = getCount(text);

        System.out.println(count);
    }

    private static int getCount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol){
                case'a':
                case'o':
                case'u':
                case'e':
                case'i':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;
            }
        }
        return count;
    }
}
