package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypeFinder_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        while (!data.equals("END")) {
            char symbol = data.charAt(0);

            if (data.length() - 1 == 0) {
                if (Character.isDigit(symbol)) {
                    System.out.println(data + " is integer type");
                } else {
                    System.out.println(data + " is character type");
                }
            } else if (data.equals("false") || data.equals("true")) {
                System.out.println(data + " is boolean type");
            } else if (Character.isDigit(symbol) && data.contains(".")) {
                System.out.println(data + " is floating point type");
            } else {

                System.out.println(data + " is string type");
            }
            data = scanner.nextLine();
        }
    }
}
