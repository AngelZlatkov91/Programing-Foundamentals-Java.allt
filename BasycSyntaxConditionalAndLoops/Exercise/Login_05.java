package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String  reversPass = "";
        for (int i = userName.length()-1; i >=0 ; i--) {
            char symbol = userName.charAt(i);
            reversPass += symbol;
        }
        int countFail = 0;

        while (countFail < 4) {
            String pass = scanner.nextLine();
            if (!pass.equals(reversPass)) {
                countFail++;
                if (countFail == 4) {
                    System.out.printf("User %s blocked!", userName);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.",userName);
                break;
            }
        }

    }
}
