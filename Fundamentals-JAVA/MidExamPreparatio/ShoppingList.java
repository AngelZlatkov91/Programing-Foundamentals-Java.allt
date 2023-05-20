package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> producktList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            if (input.contains("Urgent")) {
                String item = input.split(" ")[1];
                if (!producktList.contains(item)) {
                    producktList.add(0,item);
                }
            } else if (input.contains("Unnecessary")) {
                String itemRemove = input.split(" ")[1];
                producktList.remove(itemRemove);
            } else if (input.contains("Correct")) {
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];
                for (int i = 0; i < producktList.size(); i++) {
                    String item = producktList.get(i);
                    if (oldItem.equals(item)){
                        producktList.remove(item);
                        producktList.add(i,newItem);
                    }
                }
            } else if (input.contains("Rearrange")) {
                String itemRear = input.split(" ")[1];
                if (producktList.contains(itemRear)) {
                    producktList.remove(itemRear);
                    producktList.add(itemRear);
                }
                
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < producktList.size(); i++) {
            String product = producktList.get(i);
            if (i == producktList.size()-1) {
                System.out.print(product);
            } else {
                System.out.print(product + ", ");
            }
        }





    }
}
