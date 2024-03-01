package AssociativeArraysMap.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nameAndPoint = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String user = input.split("-")[0];
            String action = input.split("-")[1];
            if (action.equals("banned")) {
                nameAndPoint.remove(user);
            } else {
                int point = Integer.parseInt(input.split("-")[2]);
                 if (!nameAndPoint.containsKey(user)) {
                     nameAndPoint.put(user,0);
                 }
                 int curremtPoint = nameAndPoint.get(user);
                 if (curremtPoint < point) {
                     nameAndPoint.put(user, point);
                 }
                 if (!submissions.containsKey(action)) {
                     submissions.put(action,0);
                 }
                 int currentSubmission = submissions.get(action);
                 submissions.put(action,currentSubmission + 1);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        nameAndPoint.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        submissions.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
