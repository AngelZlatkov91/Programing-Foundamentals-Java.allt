package FinalExam.FinalExam_01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<Start>[\\#\\|])(?<itemName>[A-Za-z]+\\s*[A-Za-z]*)\\1(?<datum>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]+)\\1";
                    // "(?<suroundedGroup>[\\#\\|]*)(?<itemName>[A-Za-z]+\\s*[A-Za-z]*)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]+)\\1"
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int allCal = 0;
        Map<String, List<String>> product = new LinkedHashMap<>();
        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String datum = matcher.group("datum");
            String cal = matcher.group("calories");
            int calories = Integer.parseInt(cal);
            allCal += calories;
            if (!product.containsKey(itemName)) {
                product.put(itemName, new ArrayList<>());
            }
            product.get(itemName).add(datum); // na 0 poz
            product.get(itemName).add(cal); // na 1 poz
        }
        if (allCal > 2000) {
            allCal = allCal / 2000;
            System.out.printf("You have food to last you for: %d days!%n",allCal);
        } else {
            System.out.println("You have food to last you for: 0 days!");
        }
        for (Map.Entry<String, List<String>> entry : product.entrySet()) {
            String name = entry.getKey();
            String datum = entry.getValue().get(0);
            String nutrition = entry.getValue().get(1);
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",name,datum,nutrition);
        }


    }
}
