package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        if (values.equals("int")) {
            int oneDigit = Integer.parseInt(scanner.nextLine());
            int twoDigit = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(oneDigit,twoDigit));

        } else if (values.equals("char")) {
            char firstSymbol = scanner.nextLine().charAt(0);
            char secondSymbol = scanner.nextLine().charAt(0);
            System.out.println(getMac(firstSymbol,secondSymbol));
        } else if (values.equals("string")) {
            String firstText = scanner.nextLine();
            String secondText = scanner.nextLine();
            System.out.println(getMax(firstText,secondText));
        }
    }
    private static int getMax (int a,int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    private static char getMac (char one,char two) {
        if (one > two) {
            return one;
        }
        return two;
    }
    private static String getMax (String textOne, String textTwo) {
        if (textOne.compareTo(textTwo) >= 0) {
            return textOne;
        }
        return textTwo;
    }
}
