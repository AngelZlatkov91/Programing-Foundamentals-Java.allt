package MidExamPreparatio;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumList = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
          int lastPosition = 0;
        int sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            int lastPositionnn = 0;
            int lengthIndex = Integer.parseInt(input.split(" ")[1]);
            sum += lengthIndex;
            for (int i = 0; i < evenNumList.size(); i++) {
                int number = evenNumList.get(i);
                if (evenNumList.size()-1 < sum) {
                     if (evenNumList.get(0) == 0) {
                         System.out.printf("Place %d already had Valentine's day.%n", i);
                         sum = 0;
                         break;
                     }
                    int firstDigit = evenNumList.get(0);
                    evenNumList.remove(0);
                    evenNumList.add(0,firstDigit-2);
                    sum = 0;
                    if (evenNumList.get(0) == 0) {
                        System.out.println("Place 0 has Valentine's day." );
                    }
                    break;
                } else if (sum == i) {
                    if (sum == 0){
                        System.out.printf("Place %d already had Valentine's day.%n", i);
                        break;
                    }
                  if (number > 2) {
                      evenNumList.remove(i);
                      evenNumList.add(i,number - 2);
                      break;
                  } else {
                      evenNumList.remove(i);
                      evenNumList.add(i,0);
                      System.out.println("Place " + i + " has Valentine's day." );
                      break;
                  }
                }

            }
            lastPositionnn += sum;
            lastPosition = lastPositionnn;

            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",lastPosition);
        int places = 0;
        for (int digit : evenNumList) {
            if (digit !=0) {
               places++;
            }
        }

        if (places == 0) {
            System.out.println("Mission was successful.");
        } else {

            System.out.printf("Cupid has failed %d places.",places);
        }
    }
}
