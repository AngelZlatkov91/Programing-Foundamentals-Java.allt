package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchData_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataText = scanner.nextLine();
        String regex = "(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<years>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dataText);
        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("years");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }



    }
}
