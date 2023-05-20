package BasicSyntax;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        String mont = "";
        switch (month) {
            case 1:
                mont = "January";
                break;
            case 2:
                mont = "February";
                break;
            case 3:
                mont = "March";
                break;
            case 4:
                mont = "April";
                break;
            case 5:
                mont = "May";
                break;
            case 6:
                mont = "June";
                break;
            case 7:
                mont = "July";
                break;
            case 8:
                mont = "August";
                break;
            case 9:
                mont = "September";
                break;
            case 10:
                mont = "October";
                break;
            case 11:
                mont = "November";
                break;
            case 12:
                mont = "December";
                break;
            default:
                mont = "Error";
                break;
        }
        System.out.println(mont);
    }
}
