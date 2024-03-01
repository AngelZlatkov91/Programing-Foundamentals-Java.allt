package FinalExam.FinalExam_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String placeText = scanner.nextLine();
        String regex = "(?<surended>[=\\/])(?<destination>[A-Z][A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(placeText);
        List<String> destination = new ArrayList<>();
        int points = 0;
        while (matcher.find()) {
            String group = matcher.group("destination");
            destination.add(group);
            points += group.length();
        }
        System.out.println("Destinations: " + String.join(", ",destination));
        System.out.println("Travel Points: " + points);





    }
}
