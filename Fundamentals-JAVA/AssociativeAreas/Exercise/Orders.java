package AssociativeAreas.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productAndPrice = new LinkedHashMap<>();
        Map<String, Integer> prodAndQuan = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String [] list = input.split("\\s+");
            String product = list[0];
            double price = Double.parseDouble(list[1]);
            int quantiti = Integer.parseInt(list[2]);

           if (!productAndPrice.containsKey(product)) {
               productAndPrice.put(product,0.0);
               prodAndQuan.put(product,0);
           }
           int currentQuan = prodAndQuan.get(product);
           productAndPrice.put(product,price);
           prodAndQuan.put(product,currentQuan + quantiti);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productAndPrice.entrySet()) {
            String product = entry.getKey();
            double price = prodAndQuan.get(product) * entry.getValue();
            productAndPrice.put(product,price);
        }
        productAndPrice.forEach((key, value) -> System.out.printf("%s -> %.2f%n",key,value));


    }
}
