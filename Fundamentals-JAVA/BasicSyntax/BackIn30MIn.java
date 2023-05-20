package BasicSyntax;

import java.util.Scanner;

public class BackIn30MIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int hours = Integer.parseInt(scanner.nextLine());
       int minutes = Integer.parseInt(scanner.nextLine());
       int alminutes = (hours * 60) + minutes + 30;
       int hourss = alminutes / 60;
       int minutess = alminutes % 60;
       if (hourss > 23) {
           hourss = 0;
       }
        System.out.printf("%d:%02d",hourss, minutess);

    }
}
