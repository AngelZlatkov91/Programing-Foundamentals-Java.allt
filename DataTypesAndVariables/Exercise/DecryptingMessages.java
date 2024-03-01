package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int nLines = Integer.parseInt(scanner.nextLine());
        StringBuilder decryptText = new StringBuilder();
        for (int i = 1; i <= nLines ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            char newSymbol = (char) (symbol + key);
            decryptText.append(newSymbol);
        }

        System.out.println(decryptText);




    }
}
