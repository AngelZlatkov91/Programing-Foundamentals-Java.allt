package FinalExam.FinalExam_01;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String text = scanner.nextLine();
       String regex = "(?<suroundedGroup>[\\#\\|]*)(?<itemName>[A-Za-z]+\\s*[A-Za-z]*)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String calorieRegex = "(?<suroundedGroup>[#|]+)(?<calories>[0-9]+)\\1";
        Pattern caloriePatern = Pattern.compile(calorieRegex);
        Matcher matcherCalorie = caloriePatern.matcher(text);
        int totalCalories = 0;
        while (matcherCalorie.find()) {
            int group = Integer.parseInt(matcherCalorie.group("calories"));
            totalCalories += group;
        }
        if (totalCalories > 2000) {
            totalCalories = totalCalories / 2000;
        } else {
            totalCalories =0;
        }

        System.out.println("You have food to last you for: " + totalCalories + " days!");
        while (matcher.find()) {
            String item = matcher.group("itemName");
            String bestBefore = matcher.group("date");
            int group = Integer.parseInt(matcher.group("calories"));
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",item,bestBefore,group);
        }


    }
}
