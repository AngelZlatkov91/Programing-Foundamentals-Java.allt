package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] dayName = {
                "Invalid day!",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        System.out.println(dayName[dayNumber]);





    }
}
