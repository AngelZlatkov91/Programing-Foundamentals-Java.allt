package MidExam.ProgFound_05;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int totalLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double totalBonus = Double.MIN_VALUE;
        int studentAttended = 0;


        for (int i = 1; i <=numberOfStudents ; i++) {
            int countAttendancesForStudent = Integer.parseInt(scanner.nextLine());
            double bonus = countAttendancesForStudent * 1.0/ totalLectures * (5 + additionalBonus);
            if (totalBonus < bonus) {
                totalBonus = bonus;
                studentAttended = countAttendancesForStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(totalBonus));
        System.out.println("The student has attended " + studentAttended + " lectures.");

    }
}
