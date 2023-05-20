package AssociativeAreas.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> curses = new LinkedHashMap<>();
        Map<String, Integer> countStudents = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] commands = input.split(" : ");
            String curse = commands[0];
            String name = commands[1];
            if (!curses.containsKey(curse)) {
                curses.put(curse, new ArrayList<>());
                countStudents.put(curse,0);
            }
            curses.get(curse).add(name);
            int currentStudent = countStudents.get(curse);
            countStudents.put(curse,currentStudent + 1);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : curses.entrySet()) {
            int count = countStudents.get(entry.getKey());

            System.out.println(entry.getKey() + ": " + count);
            System.out.println("-- " + String.join("\n-- " ,entry.getValue()));

        }


    }
}
