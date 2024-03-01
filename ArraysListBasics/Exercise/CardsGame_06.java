package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!firstPlayer.isEmpty()) {
            if (secondPlayer.isEmpty()) {
                break;
            }
            int firstDigit = firstPlayer.get(0);
            int secondDigit = secondPlayer.get(0);
            if (firstDigit > secondDigit) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                firstPlayer.add(firstDigit);
                firstPlayer.add(secondDigit);
            } else if (secondDigit > firstDigit) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(secondDigit);
                secondPlayer.add(firstDigit);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }

        }

        if (firstPlayer.isEmpty()) {
             int secondPlayrSum = 0;
            for (int cards : secondPlayer) {
                secondPlayrSum+= cards;
            }
            System.out.println("Second player wins! Sum: " + secondPlayrSum);
        }else {
            int firstPlayrSum = 0;
            for (int cards : firstPlayer) {
                firstPlayrSum +=cards;
            }
            System.out.println("First player wins! Sum: " + firstPlayrSum);
        }


    }
}
