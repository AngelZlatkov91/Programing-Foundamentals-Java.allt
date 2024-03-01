package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalIncome = 0;
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<productName>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
          Matcher matcher = pattern.matcher(input);
          if (matcher.find()) {
              String personName = matcher.group("name");
              String productName = matcher.group("productName");
              int count = Integer.parseInt(matcher.group("count"));
              double price = Double.parseDouble(matcher.group("price"));
              double sum = count * price;
              totalIncome +=sum;
              System.out.printf("%s: %s - %.2f%n",personName,productName,sum);
          }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);



    }
}
