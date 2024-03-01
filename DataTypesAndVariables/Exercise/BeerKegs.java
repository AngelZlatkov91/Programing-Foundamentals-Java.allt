package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double biggestKegValue = Double.MIN_VALUE;
        for (int i = 1; i <=nLine ; i++) {
            String nameKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double max = Math.PI * Math.pow(radius, 2) * height;
          if (biggestKegValue < max) {
              biggestKegValue = max;
              biggestKeg = nameKeg;
          }
        }
        System.out.println(biggestKeg);







    }
}
