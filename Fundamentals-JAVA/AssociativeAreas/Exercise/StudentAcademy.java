package AssociativeAreas.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStudents = Integer.parseInt(scanner.nextLine());
        Map<String,Double> studentsGrade = new LinkedHashMap<>();
        Map<String,Integer> countStudents = new LinkedHashMap<>();
        for (int i = 1; i <=nStudents ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name,0.0);
                countStudents.put(name, 0);
            }
            int curretnCount = countStudents.get(name);
            double currentGrade = studentsGrade.get(name);
            countStudents.put(name, curretnCount + 1);
            studentsGrade.put(name, currentGrade + grade);
        }

        for (Map.Entry<String, Double> entry : studentsGrade.entrySet()) {
            int count = countStudents.get(entry.getKey());
            double grade = entry.getValue();
            double sum = grade / count;
            if (sum >= 4.50) {
                System.out.printf("%s -> %.2f%n",entry.getKey(),sum);
            }
        }


    }
}
