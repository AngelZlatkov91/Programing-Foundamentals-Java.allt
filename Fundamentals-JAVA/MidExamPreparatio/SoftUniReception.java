package MidExamPreparatio;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employerOne = Integer.parseInt(scanner.nextLine());
        int employerTwo = Integer.parseInt(scanner.nextLine());
        int employerThree = Integer.parseInt(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        int sumStudent = employerOne + employerTwo + employerThree;
        int counter = 0;
        int breakCounter = 0;
        boolean isSmal = false;
        while (countStudents > 0) {
            if (sumStudent >= countStudents) {
                counter++;
                isSmal = true;
                break;
            }
            countStudents -= sumStudent;
            counter++;
            if (counter % 3 == 0) {
                breakCounter++;
            }

        }
        if (isSmal){
            System.out.printf("Time needed: %dh.",counter + breakCounter);
        } else  {
            System.out.printf("Time needed: %d.",counter + breakCounter);
        }
    }
}
