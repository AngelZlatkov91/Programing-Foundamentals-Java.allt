package ListArray.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());

        List<String> peopleList = new ArrayList<>();
        for (int i = 1; i <= countPeople; i++) {
            String names = scanner.nextLine();
            String name = names.split(" ")[0];
            if (names.contains("not")) {
                if (!peopleList.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    peopleList.remove(name);
                }
            } else {
               if (peopleList.containsAll(Collections.singleton(name))) {
                   System.out.println(name + " is already in the list!");
               } else {
                   peopleList.add(name);
               }
            }

        }
        for (String people : peopleList) {
            System.out.println(people);
        }


    }
}
