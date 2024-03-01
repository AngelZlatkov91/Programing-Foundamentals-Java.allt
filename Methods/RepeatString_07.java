package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeatText = scanner.nextLine();
        int nRepeat= Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(repeatText,nRepeat));

    }
    private static String repeatString (String text, int count) {
        String result = "";
        for (int i = 1; i <=count ; i++) {
            result += text;
        }
        return result;
    }
}
