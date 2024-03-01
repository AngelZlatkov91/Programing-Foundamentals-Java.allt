package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDigit = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <=countDigit ; i++) {
            BigDecimal currentDigit = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentDigit);
        }
        System.out.println(sum);



    }
}
