package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int length = password.length();
        int count = 0;
        count = lengthPassword(length, count);
        count = isLetterOrDigit(password, count);
        count = mustHaveTwoDigits(password, count);
        validPass(count);


    }

    private static void validPass(int count) {
        if (count == 0) {
            System.out.println("Password is valid");
        }
    }

    private static int mustHaveTwoDigits(String password, int count) {
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                countDigit++;
            }
        }
        if (countDigit < 2) {
            System.out.println("Password must have at least 2 digits");
            count++;
        }
        return count;
    }

    private static int isLetterOrDigit(String password, int count) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                count++;
                break;
            }
        }
        return count;
    }

    private static int lengthPassword(int length, int count) {
        if (length < 6 || length > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            count++;
        }
        return count;
    }
}
