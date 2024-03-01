package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class Factoriel_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <=n ; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
