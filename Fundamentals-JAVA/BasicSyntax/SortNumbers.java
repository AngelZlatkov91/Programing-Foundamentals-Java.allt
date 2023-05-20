package BasicSyntax;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thurdDigit = Integer.parseInt(scanner.nextLine());
        int firstPlace = 0;
        int secondPlace = 0;
        int thurPlace = 0;
         if (firstDigit > secondDigit && firstDigit > thurdDigit){
             firstPlace = firstDigit;
             if (secondDigit > thurdDigit){
                 secondPlace = secondDigit;
                 thurPlace = thurdDigit;
             }
             else {
                 secondPlace = thurdDigit;
                 thurPlace = secondDigit;
             }

         } else if (secondDigit > firstDigit && secondDigit > thurdDigit) {
             firstPlace = secondDigit;
             if (firstDigit > thurdDigit){
                 secondPlace = firstDigit;
                 thurPlace = thurdDigit;
             }
             else {
                 secondPlace = thurdDigit;
                 thurPlace = firstDigit;
             }
         } else {
             firstPlace = thurdDigit;

             if (secondDigit > firstDigit){
                 secondPlace = secondDigit;
                 thurPlace = firstDigit;
             }
             else {
                 secondPlace = firstDigit;
                 thurPlace = secondDigit;
             }
         }
        System.out.println(firstPlace);
        System.out.println(secondPlace);
        System.out.println(thurPlace);

    }
}
