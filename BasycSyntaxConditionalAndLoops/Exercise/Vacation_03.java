package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String classPeople = scanner.nextLine();
        String day = scanner.nextLine();
       double totalPrice = 0;
       if (classPeople.equals("Students")) {
           switch (day) {
               case "Friday":
                   totalPrice = peopleCount * 8.45;
                   break;
               case "Saturday":
                   totalPrice = peopleCount * 9.80;
                   break;
               case "Sunday":
                   totalPrice = peopleCount * 10.46;
                   break;
           }
       } else if (classPeople.equals("Business")) {
           switch (day) {
               case "Friday":
                   totalPrice = peopleCount * 10.90;
                   break;
               case "Saturday":
                   totalPrice = peopleCount * 15.60;
                   break;
               case "Sunday":
                   totalPrice = peopleCount * 16;
                   break;
           }
       } else if (classPeople.equals("Regular")) {
           switch (day) {
               case "Friday":
                   totalPrice = peopleCount * 15;
                   break;
               case "Saturday":
                   totalPrice = peopleCount * 20;
                   break;
               case "Sunday":
                   totalPrice = peopleCount * 22.50;
                   break;
           }
       }
        if (classPeople.equals("Students") && peopleCount >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (classPeople.equals("Business") && peopleCount >= 100) {
            totalPrice = totalPrice - (10 * (totalPrice / peopleCount));
        } else if (classPeople.equals("Regular")&& peopleCount >=10 && peopleCount <=20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
