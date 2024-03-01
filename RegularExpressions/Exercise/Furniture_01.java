package RegularExpressions.Exercise;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
         double totalSpend = 0;
         String regex = ">>(?<nameProduct>[A-Za-z]+)<<(?<price>\\d+[.]*\\d+)!(?<quantity>\\d*)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("nameProduct");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                names.add(name);
                totalSpend += price * quantity;
            }
            input  = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String product : names) {
            System.out.println(product);
        }
        System.out.printf("Total money spend: %.2f",totalSpend);
    }
}
