package MidExamPreparatio;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagon = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < wagon.length; i++) {
            int wagonIndex = wagon[i];
            if (people <= 0) {
                break;
            }

            if (wagonIndex == 1) {
                people -=3;
                wagon[i] = 4;
            } else if (wagonIndex == 2) {
                people -=2;
                wagon[i] = 4;
            } else if (wagonIndex == 3) {
                people -= 1;
                wagon[i] = 4;
            } else if (wagonIndex == 0) {
                if (people < 4) {
                    wagon[i] = people;
                    people -= people;
                } else {
                    people -= 4;
                    wagon[i] = 4;
                }

            }
        }
         if (people >0) {
             System.out.printf("There isn't enough space! %d people in a queue!%n",people);
             for (int result : wagon) {
                 System.out.print(result + " ");
             }
         } else {
             boolean isEmpty = false;
             for (int result : wagon) {
                 if (result !=4) {
                     isEmpty = true;
                     break;
                 }
             }
             if (isEmpty) {
                 System.out.println("The lift has empty spots!");
                 for (int result : wagon) {
                     System.out.print(result + " ");
                 }

             } else {
                 for (int result : wagon) {
                     System.out.print(result + " ");
                 }
             }

         }




    }
}
