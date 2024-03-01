package Methods;
import java.util.Scanner;

public class MultiplayEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int mathAbs = Math.abs(number);
        multiply(mathAbs);
    }

    private static void multiply(int mathAbs) {
        int evenDigit = 0;
        int oddDigit = 0;
        while (true) {
            int digit = mathAbs % 10;
            if (digit % 2 == 0) {
                evenDigit += digit;
            } else {
                oddDigit += digit;
            }
            mathAbs = mathAbs / 10;
            if (mathAbs == 0) {
                break;
            }
        }
        System.out.println(evenDigit * oddDigit);
    }
}
