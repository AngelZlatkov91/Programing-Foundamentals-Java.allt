package AssociativeAreas.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> usersAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languageAndCounts = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String [] commands = input.split("-");
            String userName = commands[0];
            String language = commands[1];
         if (!language.equals("banned")) {
            int points = Integer.parseInt(commands[2]);
            if (!usersAndPoints.containsKey(userName)) {
                usersAndPoints.put(userName,0);
            }
            if (usersAndPoints.get(userName) < points) {
                usersAndPoints.put(userName,points);
            }
            if (!languageAndCounts.containsKey(language)) {
                languageAndCounts.put(language,0);
            }
                int currentCount = languageAndCounts.get(language);
                languageAndCounts.put(language,currentCount + 1);


         } else {
             usersAndPoints.remove(userName);
         }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        usersAndPoints.forEach((key , value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        languageAndCounts.forEach((key, value) -> System.out.println(key + " - " + value));




    }
}
