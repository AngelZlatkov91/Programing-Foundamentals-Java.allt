package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textWithPhoneNUmber = scanner.nextLine();
       String regex = "\\+359([- ])?2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textWithPhoneNUmber);
        List<String> noumbers = new ArrayList<>();
        while (matcher.find()) {
            String noumber = matcher.group();
            noumbers.add(noumber);
        }
        System.out.print(String.join(", ",noumbers));




    }
}
