package ListArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commands = input.split(" ");
            if (commands[0].equals("Add")) {
                int num = Integer.parseInt(commands[1]);
                digits.add(num);
            } else if (commands[0].equals("Remove")) {
                int removeNum = Integer.parseInt(commands[1]);

                digits.remove(Integer.valueOf(removeNum));
            } else if (commands[0].equals("RemoveAt")) {
                int removeIndex = Integer.parseInt(commands[1]);
                digits.remove(removeIndex);
            } else if (commands[0].equals("Insert")) {
                int numInsert = Integer.parseInt(commands[1]);
                int numIndex = Integer.parseInt(commands[2]);
               digits.add(numIndex,numInsert);

            }

            input = scanner.nextLine();
        }

        for (int num : digits) {
            System.out.print(num + " ");
        }





    }
}
