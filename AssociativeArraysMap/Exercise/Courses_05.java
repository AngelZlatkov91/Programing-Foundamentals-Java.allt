package AssociativeArraysMap.Exercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesList = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String curseName = input.split(" : ")[0];
            String nameStudent = input.split(" : ")[1];

            if (!coursesList.containsKey(curseName)) {
                coursesList.put(curseName, new ArrayList<>());
            }
            coursesList.get(curseName).add(nameStudent);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            System.out.print("-- " + String.join("\n-- ", entry.getValue()));
            System.out.println();
        }


    }
}
