package DataTypesAndVariables;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            char symbol = (char) input.indexOf(0);
            char symbol0 = (char) input.indexOf(1);



            if (input.equals("true") || input.equals("false")) {
                System.out.println(input + " is boolean type");
            } else if ((symbol >= 48 && symbol <=57) && input.contains(".")) {
                System.out.println(input + " is floating point type");
            } else if ((symbol >= 48 && symbol <=57) || (symbol0 >= 48 && symbol0 <=57) ) {
                System.out.println(input + " is integer type");
            } else if (input.length()-1 > 0) {
                System.out.println(input + " is string type");
            }


            input = scanner.nextLine();
        }

    }
}
