package ArraysListBasics.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCommands = Integer.parseInt(scanner.nextLine());

        List<String> people = new ArrayList<>();
        for (int i = 1; i <=nCommands ; i++) {
            String peopleAction = scanner.nextLine();
            String name = peopleAction.split(" ")[0];
            if (peopleAction.contains("is going!")) {
                if (!people.contains(name)) {
                    people.add(name);
                } else {
                    System.out.println(name + " is already in the list!");
                }
            } else if (peopleAction.contains("is not going!")) {
                if (!people.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    people.remove(name);
                }
            }

        }
        for (String name : people) {
            System.out.println(name);
        }







    }
}
