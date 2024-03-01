package MidExam.ProgFound_02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployer = Integer.parseInt(scanner.nextLine());
        int secondEmployer = Integer.parseInt(scanner.nextLine());
        int turdEmployer = Integer.parseInt(scanner.nextLine());
        int numberOfStudents =  Integer.parseInt(scanner.nextLine());
        int perHour = firstEmployer + secondEmployer + turdEmployer;

        int countHour = 0;
        int allHours = 0;
        while (numberOfStudents > 0) {
            numberOfStudents -= perHour;
            countHour++;
            allHours++;
            if (numberOfStudents <=0) {
                break;
            }
            if (countHour % 3 == 0) {
                allHours++;
                countHour = 0;
            }
        }
        System.out.printf("Time needed: %dh.",allHours);





    }
}
