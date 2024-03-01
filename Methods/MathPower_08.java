package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double digit = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getPow(digit
        ,power)));
    }

    private static double getPow(double digit, double power) {
        return Math.pow(digit, power);
    }
}
