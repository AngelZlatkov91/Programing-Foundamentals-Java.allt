package ListArray.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Add")) {
                int peopleWagon = Integer.parseInt(input.split(" ")[1]);
                wagonsList.add(peopleWagon);
            } else {
                int people = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    int existingWagonPeople = wagonsList.get(i);
                    if ((existingWagonPeople + people) <= maxCapacity) {
                        wagonsList.add(i,existingWagonPeople + people);
                        wagonsList.remove(i+1);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int result : wagonsList) {
            System.out.print(result + " ");
        }

    }
}
