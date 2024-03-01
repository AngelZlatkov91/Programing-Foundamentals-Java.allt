package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
       int numberOfSnowballs =Integer.parseInt(scanner.nextLine());

       double maxValue = Double.MIN_VALUE;
       int maxSnowBall = 0;
       int maxSnowBallTime = 0;
       int maxSnowBallQuality = 0;

        for (int i = 1; i <=numberOfSnowballs ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int valuePow = snowballSnow / snowballTime;
            double value = Math.pow(valuePow,snowballQuality);
           if (maxValue < value) {
               maxValue = value;
               maxSnowBall = snowballSnow;
               maxSnowBallTime = snowballTime;
               maxSnowBallQuality = snowballQuality;
           }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowBall,maxSnowBallTime,maxValue,maxSnowBallQuality);




    }
}
