package MidExam.ProgFound_01;
import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int peopleWait = Integer.parseInt(scanner.nextLine());
        int[] lifts = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isEmpty = false;
    for (int i = 0; i < lifts.length; i++) {
        if (peopleWait <= 0){
            break;
        }

        int currentLift = lifts[i];
        if (currentLift < 4) {
            int diff = 4 - currentLift;
            if (peopleWait - diff <= 0) {
                lifts[i] = peopleWait;
                peopleWait =0;
                isEmpty =true;
                break;

            } else {
                lifts[i] = 4;
                peopleWait -= diff;
            }
        }
    }
    if (isEmpty) {
        int countEmptySpot = 0;
        for (int lift :lifts) {
            if (lift < 4) {
                countEmptySpot++;
            }
        }
        if (countEmptySpot ==0) {
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else {
            System.out.println("The lift has empty spots!");
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        }

    } else {
        System.out.printf("There isn't enough space! %d people in a queue!%n",peopleWait);
        for (int lift : lifts) {
            System.out.print(lift + " ");
        }
    }




     }
}
