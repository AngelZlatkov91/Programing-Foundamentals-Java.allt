package MidExam.ProgFound_03;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.contains("Shoot")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int power = Integer.parseInt(input.split(" ")[2]);
                if (index>=0 && index<= targets.size()-1) {
                    int currentDigit = targets.get(index);
                    if ((currentDigit - power) <= 0) {
                        targets.remove(index);
                    } else {
                        targets.set(index,currentDigit - power);
                    }
                }
            } else if (input.contains("Add")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int value = Integer.parseInt(input.split(" ")[2]);
                if(index>=0 && index<= targets.size()-1) {
                    targets.add(index,value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (input.contains("Strike")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int radius = Integer.parseInt(input.split(" ")[2]);
                int strikeForStrike = index +radius;
                int strikeBackStrike = index - radius;
                if (strikeForStrike <= targets.size()-1 && strikeBackStrike >=0) {

                    for (int i = strikeBackStrike; i <=strikeForStrike ; i++) {
                        targets.remove(strikeBackStrike);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            int digit = targets.get(i);
            if (i == targets.size()-1) {
                System.out.print(digit);
            } else {
                System.out.print(digit + "|");
            }
        }


    }
}
