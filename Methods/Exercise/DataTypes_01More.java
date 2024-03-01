package Methods.Exercise;

import java.util.Scanner;

public class DataTypes_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        dataTypes(scanner, input);
    }

    private static void dataTypes(Scanner scanner, String input) {
        if (input.equals("int")) {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(num * 2);
        } else if (input.equals("real")) {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.printf("%.2f",num * 1.5);
        } else {
            String text = scanner.nextLine();
            System.out.printf("$%s$",text);
        }
    }
}
