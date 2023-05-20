package DataTypesAndVariables;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int nLines = Integer.parseInt(scanner.nextLine());
        StringBuilder decrypt = new StringBuilder();

        for (int i = 1; i <=nLines ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            symbol += key;
            decrypt.append(symbol);
        }
        System.out.println(decrypt);
    }
}
