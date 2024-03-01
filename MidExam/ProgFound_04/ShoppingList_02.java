package MidExam.ProgFound_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            if (input.contains("Urgent")){
                String item = input.split(" ")[1];
                if (!shoppingList.contains(item)) {
                    shoppingList.add(0,item);
                }
            } else if (input.contains("Unnecessary")) {
                String item = input.split(" ")[1];
                shoppingList.remove(item);
            } else if (input.contains("Correct")) {
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];
                if (shoppingList.contains(oldItem)){
                    int index = shoppingList.indexOf(oldItem);
                    shoppingList.remove(oldItem);
                    shoppingList.add(index,newItem);
                }
            } else if (input.contains("Rearrange")) {
                String item = input.split(" ")[1];
                if (shoppingList.contains(item)){
                    shoppingList.remove(item);
                    shoppingList.add(item);
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            String product = shoppingList.get(i);
            if (i == shoppingList.size()-1) {
                System.out.print(product);
            } else {
                System.out.print(product + ", ");
            }
        }
    }
}
