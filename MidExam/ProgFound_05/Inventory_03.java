package MidExam.ProgFound_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journalItems = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            if (input.contains("Collect")) {
                String item = input.split(" - ")[1];
                if (!journalItems.contains(item)) {
                    journalItems.add(item);
                }
            } else if (input.contains("Drop")) {
                String item = input.split(" - ")[1];
                journalItems.remove(item);

            } else if (input.contains("Combine Items")) {
                String items = input.split(" - ")[1];
                String oldItem = items.split(":")[0];
                String newItem = items.split(":")[1];
                if (journalItems.contains(oldItem)) {
                    int index = journalItems.indexOf(oldItem);
                    journalItems.add(index + 1,newItem);
                }
            } else if (input.contains("Renew")) {
                String item = input.split(" - ")[1];
                if (journalItems.contains(item)) {
                    journalItems.remove(item);
                    journalItems.add(item);
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < journalItems.size(); i++) {
            String item = journalItems.get(i);
            if (i == journalItems.size()-1) {
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }
        }



    }
}
