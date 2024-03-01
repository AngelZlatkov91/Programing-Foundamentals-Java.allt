package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int limitPeopleInWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Add")) {
                int newWagon = Integer.parseInt(input.split(" ")[1]);
                wagonsList.add(newWagon);
            } else {
                int passengers = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    int currentNum = wagonsList.get(i);
                    if (currentNum + passengers <= limitPeopleInWagon) {
                        wagonsList.remove(i);
                        wagonsList.add(i,currentNum + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.print(wagonsList.toString().replaceAll("[\\[\\],]", ""));

    }
}
