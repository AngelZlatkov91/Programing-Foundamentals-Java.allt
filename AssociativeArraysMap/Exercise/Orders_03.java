package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productAndPrice = new LinkedHashMap<>();
        Map<String, Integer> quantityAndProduct = new LinkedHashMap<>();



        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] product = input.split(" ");

         if (!productAndPrice.containsKey(product[0])) {
             productAndPrice.put(product[0], 0.0 );
             quantityAndProduct.put(product[0],0 );
         }
             double price = Double.parseDouble(product[1]);
             int quantity = Integer.parseInt(product[2]);
             int currentQuantity = quantityAndProduct.get(product[0]);
             quantityAndProduct.put(product[0], currentQuantity + quantity);
             productAndPrice.put(product[0], price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productAndPrice.entrySet()) {
            String product = entry.getKey();
            double productPrice = entry.getValue();
            int quantity = quantityAndProduct.get(product);
            productAndPrice.put(product,productPrice * quantity);
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }

    }
}
