package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String [] userNames = scanner.nextLine().split(", ");
        for (String name : userNames) {
            if (name.length() >= 3 && name.length() <= 16) {
                int count = 0;
                for (int i = 0; i < name.length(); i++) {
                    char symbol = name.charAt(i);
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                        count++;
                    }
                }
                if (count ==0) {
                    System.out.println(name);
                }
            }
        }
    }
}
