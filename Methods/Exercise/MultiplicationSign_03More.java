package Methods.Exercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MultiplicationSign_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        signDigit(n1, n2, n3);
    }

    private static void signDigit(int n1, int n2, int n3) {
        int sum = n1 * n2 * n3;
        if (sum < 0) {
            System.out.println("negative");
        } else if (sum > 0){
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}
