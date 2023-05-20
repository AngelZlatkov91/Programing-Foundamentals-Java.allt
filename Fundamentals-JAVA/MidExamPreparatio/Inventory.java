package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

       String input = scanner.nextLine();
       while (!input.equals("Craft!")) {
           String [] command = input.split(" - ");
           if (input.contains("Collect")) {
               String item = command[1];
               if (!itemsList.contains(item)) {
                   itemsList.add(item);
               }
           } else if (input.contains("Drop")) {
               String item = command[1];
               itemsList.remove(item);
           } else if (input.contains("Combine")) {
               String[] items = command[1].split(":");
               String oldItem = items[0];
               String newItem = items[1];
               for (int i = 0; i < itemsList.size(); i++) {
                   String currentItem = itemsList.get(i);
                   if (currentItem.equals(oldItem)) {
                       itemsList.add(i+1,newItem);
                   }
               }
               
           } else if (input.contains("Renew")) {
               String item = command[1];
               for (int i = 0; i < itemsList.size(); i++) {
                   String currentItem = itemsList.get(i);
                   if (currentItem.equals(item)) {
                       itemsList.remove(item);
                       itemsList.add(currentItem);
                   }
               }
           }

           input = scanner.nextLine();
       }
        for (int i = 0; i < itemsList.size(); i++) {
            String item = itemsList.get(i);
            if (i == itemsList.size()-1) {
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }
        }



    }
}
