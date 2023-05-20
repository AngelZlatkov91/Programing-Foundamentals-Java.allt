package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biger = "";
        double bigerKeg = Double.MIN_VALUE;

        for (int i = 1; i <=n ; i++) {
            String model = scanner.nextLine();
            double radios = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

          double max = Math.PI * Math.pow(radios, 2) * height;
          if (max > bigerKeg){
              bigerKeg = max;
              biger = model;
          }

        }
        System.out.println(biger);

    }
}
