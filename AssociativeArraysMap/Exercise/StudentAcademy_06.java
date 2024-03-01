package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());
        Map<String,Double> studentAcademy = new LinkedHashMap<>();

        for (int i = 1; i <=nLines ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentAcademy.containsKey(name)) {
                studentAcademy.put(name,grade);
            } else {
                double currentGrade = studentAcademy.get(name);
                studentAcademy.put(name, (grade + currentGrade) / 2);
            }
        }
        for (Map.Entry<String, Double> entry : studentAcademy.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue());
            }
        }


    }
}
