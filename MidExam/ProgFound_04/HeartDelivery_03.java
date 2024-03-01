package MidExam.ProgFound_04;
import java.util.Arrays;
import java.util.Scanner;
public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();
         int currentJump = 0;
         int lastPosition = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            int jump = Integer.parseInt(input.split(" ")[1]);
         if (jump >=0 && jump<= neighborhood.length-1) {
             currentJump+=jump;
             if (currentJump <= neighborhood.length-1) {
                 int currentNeigh = neighborhood[currentJump];
                 if (currentNeigh == 0) {
                     System.out.println("Place " + currentJump + " already had Valentine's day.");
                 } else {
                    neighborhood[currentJump] = currentNeigh - 2;
                    lastPosition = currentJump;
                    if (neighborhood[currentJump] ==0) {
                        System.out.println("Place "+ currentJump + " has Valentine's day.");
                    }
                 }
             } else {
                 int current = neighborhood[0];
                 currentJump= 0;
                 if (current == 0) {
                     System.out.println("Place 0 already had Valentine's day.");
                 } else {
                     neighborhood[0] = current -2;
                     lastPosition = 0;
                     if (neighborhood[0] == 0) {
                         System.out.println("Place 0 has Valentine's day.");
                     }
                 }
             }
         } else {
             int current = neighborhood[0];
             currentJump = 0;
             if (current == 0) {
                 System.out.println("Place 0 already had Valentine's day.");
             } else {
                 neighborhood[0] = current -2;
                 lastPosition = 0;
                 if (neighborhood[0] == 0) {
                     System.out.println("Place 0 has Valentine's day.");
                 }
             }
         }
            input = scanner.nextLine();
        }
        System.out.println("Cupid's last position was " + lastPosition + ".");
        int count = 0;
        for (int numb : neighborhood) {
            if (numb != 0){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.println("Cupid has failed "+ count + " places.");
        }





    }
}
