package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> timeOfTwoCars = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
             int middleRace = timeOfTwoCars.size()/2;
             double firstSumTime = 0;
             int firstCountZero = 0;
        for (int i = 0; i < middleRace ; i++) {
            int currentTime = timeOfTwoCars.get(i);
            if (currentTime == 0) {
                if (firstCountZero == 0) {
                    firstSumTime = firstSumTime * 0.8;
                    firstCountZero++;
                }
            } else {
                firstSumTime += currentTime;
            }
        }
        double secondSumTime = 0;
        int secondCountZero = 0;

        for (int i = middleRace+1; i <timeOfTwoCars.size() ; i++) {
            int currentTime = timeOfTwoCars.get(i);
            if (currentTime == 0) {
                if (secondCountZero == 0) {
                    secondSumTime = secondSumTime * 0.8;
                    secondCountZero++;
                }
            } else {
                secondSumTime += currentTime;
            }

        }



        if (firstSumTime < secondSumTime) {
            System.out.printf("The winner is left with total time: %.1f",firstSumTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f",secondSumTime);

        }








    }
}
