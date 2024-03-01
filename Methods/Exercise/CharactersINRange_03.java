package Methods.Exercise;

import java.util.Scanner;

public class CharactersINRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        if (firstSymbol < secondSymbol) {
            extracted(firstSymbol, secondSymbol);
        } else {
            extracted1(firstSymbol, secondSymbol);
        }
    }

    private static void extracted1(char firstSymbol, char secondSymbol) {
        for (int i = secondSymbol +1; i < firstSymbol; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }

    private static void extracted(char firstSymbol, char secondSymbol) {
        for (int i = firstSymbol +1; i < secondSymbol; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
