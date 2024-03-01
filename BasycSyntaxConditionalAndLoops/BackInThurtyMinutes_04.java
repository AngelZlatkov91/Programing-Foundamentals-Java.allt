package BasycSyntaxConditionalAndLoops;

import java.util.Scanner;

public class BackInThurtyMinutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = (minutes + 30) + (hours * 60);
        int totalHours = allMinutes / 60;
        int totalMinutes = allMinutes % 60;

        if (totalHours > 23) {
            totalHours = 0;
        }
        System.out.printf("%d:%02d",totalHours,totalMinutes);



    }
}
