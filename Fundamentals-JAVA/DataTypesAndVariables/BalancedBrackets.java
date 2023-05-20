package DataTypesAndVariables;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int countUnbalanced = 0;

        for (int i = 1; i <=m ; i++) {
           String input = scanner.nextLine();
           if (input.equals("(")){
               count++;
           }
           if (count > 0 && input.equals(")")){
               count++;
           }


        }
        if (count % 2 == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }


    }
}
