package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= nLine; i++) {
            boolean isPrime = true;
            for (int cepitel = 2; cepitel < i; cepitel++) {
                if (i % cepitel == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
