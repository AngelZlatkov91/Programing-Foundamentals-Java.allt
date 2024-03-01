package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
          int sumPeople = 0;
        int days = 0;
       while (startingYield >= 100) {
           days++;
           sumPeople += startingYield - 26;
           startingYield -=10;
       }
        System.out.println(days);
        System.out.println(sumPeople - 26);








    }
}
