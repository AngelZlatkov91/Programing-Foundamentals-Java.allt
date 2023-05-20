package DataTypesAndVariables;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSnowBalls = Integer.parseInt(scanner.nextLine());
         double maxQualiti = Double.MIN_VALUE;
          int snowBall = 0;
          int snowTime = 0;
          int snowQualiti = 0;
        for (int i = 1; i <=numSnowBalls ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int sumSnow = snowballSnow / snowballTime;
            double snowQuliti = Math.pow(sumSnow,snowballQuality);
            if (snowQuliti > maxQualiti) {
                maxQualiti = snowQuliti;
                snowBall = snowballSnow;
                snowTime = snowballTime;
                snowQualiti = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)",snowBall,snowTime,maxQualiti,snowQualiti);

    }
}
