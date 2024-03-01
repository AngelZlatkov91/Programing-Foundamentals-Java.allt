package ArraysListBasics.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

           List<Integer> currentDrumSet = new ArrayList<>();
        currentDrumSet.addAll(drumSet);


        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(inputCommand);

            for (int i = 0; i < currentDrumSet.size(); i++) {
                int currentDigit = currentDrumSet.get(i);
                if (currentDigit != 0) {
                    currentDrumSet.set(i, currentDigit - hitPower);
                    if (currentDrumSet.get(i) <= 0) {
                        int drumBreaks = drumSet.get(i) * 3;
                        if (drumBreaks <= savings) {
                            currentDrumSet.set(i,drumSet.get(i));
                            savings -= drumBreaks;
                        } else {
                            currentDrumSet.set(i,0);
                        }
                    }

                }

            }
            inputCommand = scanner.nextLine();
        }

        for (int drums : currentDrumSet) {
            if (drums != 0 ) {
                System.out.print(drums + " ");
            }
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",savings);



    }
}
