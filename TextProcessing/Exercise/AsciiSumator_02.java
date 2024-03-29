package TextProcessing.Exercise;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char lastSymbol = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol > firstSymbol && symbol < lastSymbol) {
                sum = sum + symbol;
            }
        }
        System.out.println(sum);

    }
}
