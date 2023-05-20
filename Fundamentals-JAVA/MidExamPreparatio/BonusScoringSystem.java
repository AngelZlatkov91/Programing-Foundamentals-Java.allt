package MidExamPreparatio;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int numberOFStudents = Integer.parseInt(scanner.nextLine());
       int numberOFLectures = Integer.parseInt(scanner.nextLine());
       int bonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        int attended = 0;


        for (int i = 1; i <= numberOFStudents ; i++) {
            int attendanceStudent = Integer.parseInt(scanner.nextLine());
         double totalBonus = attendanceStudent * 1.0 / numberOFLectures * (5 + bonus);
          if (totalBonus >= maxBonus) {
              maxBonus = totalBonus;
              attended = attendanceStudent;
          }

        }

        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",attended);





    }
}
