package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

          int shots = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index <= digits.size()-1) {
                int currentNum = digits.get(index);
                digits.remove(index);
                digits.add(index,-1);
                shots++;
                for (int i = 0; i < digits.size(); i++) {
                    int num = digits.get(i);
                    if (num != -1) {
                        if (num > currentNum) {
                            digits.set(i, num - currentNum);
                        } else {
                            digits.set(i,num + currentNum);
                        }

                    }
                }

            }

            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + shots + " -> ");
        for (int i = 0; i < digits.size(); i++) {
            int num = digits.get(i);
            System.out.print(num + " ");
        }





    }
}
