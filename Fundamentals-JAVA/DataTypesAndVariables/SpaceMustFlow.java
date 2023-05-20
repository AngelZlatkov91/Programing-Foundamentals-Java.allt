package DataTypesAndVariables;

import java.util.Scanner;

public class SpaceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int people = 0;

        while (n >= 100){
            countDays++;
            people = people + (n - 26);
            n -= 10;

        }
        System.out.println(countDays);
        if (people >= 26){
            people -=26;
        }
        System.out.println(people);






    }
}
