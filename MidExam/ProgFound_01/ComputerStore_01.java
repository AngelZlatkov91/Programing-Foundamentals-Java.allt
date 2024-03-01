package MidExam.ProgFound_01;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       boolean isRegular = false;
       double totalPrice = 0;
      String input = scanner.nextLine();
      while (!input.equals("special")) {
          if (input.equals("regular")) {
              isRegular = true;
              break;
          }
          double price = Double.parseDouble(input);
         if (price > 0) {
             totalPrice += price;
         } else {
             System.out.println("Invalid price!");
         }

          input = scanner.nextLine();
      }
      double taxes = totalPrice * 0.2;
      double total = totalPrice + taxes;
      if (total == 0) {
          System.out.println("Invalid order!");
      } else if (isRegular) {
          System.out.println("Congratulations you've just bought a new computer!");
          System.out.printf("Price without taxes: %.2f$%n",totalPrice);
          System.out.printf("Taxes: %.2f$%n",taxes);
          System.out.printf("-----------%n");
          System.out.printf("Total price: %.2f$",total);
      } else {
          total = total- (total * 0.1);
          System.out.println("Congratulations you've just bought a new computer!");
          System.out.printf("Price without taxes: %.2f$%n",totalPrice);
          System.out.printf("Taxes: %.2f$%n",taxes);
          System.out.printf("-----------%n");
          System.out.printf("Total price: %.2f$",total);
      }


    }
}
