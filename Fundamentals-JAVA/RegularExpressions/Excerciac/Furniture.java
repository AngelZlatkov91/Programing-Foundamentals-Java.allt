package RegularExpressions.Excerciac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> boughtFurniture = new ArrayList<>();
        double sum = 0;
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantiti>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

       String input = scanner.nextLine();
       while (!input.equals("Purchase")) {
         Matcher matcher = pattern.matcher(input);
         if (matcher.find()) {
             String nameFurniture = matcher.group("furnitureName");
             double price = Double.parseDouble(matcher.group("price"));
             int quantiti = Integer.parseInt(matcher.group("quantiti"));
             boughtFurniture.add(nameFurniture);
             sum +=quantiti * price;

         }
           input= scanner.nextLine();
       }
        System.out.println("Bought furniture:");
        boughtFurniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",sum);


    }
}
