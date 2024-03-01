package MidExam.ProgFound_04;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double quantityFoodKg = Double.parseDouble(scanner.nextLine()) * 1000;
      double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
      double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;
      double quantityWeight = Double.parseDouble(scanner.nextLine()) * 1000;
        boolean isEmpty = false;

        for (int i = 1; i <=30 ; i++) {
           quantityFoodKg = quantityFoodKg - 300;
           if (i % 2 == 0) {
               quantityHay = quantityHay - (quantityFoodKg * 0.05);
           }
           if (i % 3 == 0) {
               quantityCover = quantityCover - (quantityWeight/3);
           }
          if (quantityFoodKg <=0 || quantityHay<=0 || quantityCover <=0) {
              isEmpty = true;
              break;
          }

        }
        if (isEmpty) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    quantityFoodKg / 1000,quantityHay / 1000,quantityCover / 1000);
        }




    }
}
