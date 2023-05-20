package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chestItems = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        boolean isEmpty = false;

        while (!input.equals("Yohoho!")) {
            String[] items = input.split(" ");
            if (input.contains("Loot")) {
                for (int i = 1; i < items.length; i++) {
                    String text = items[i];
                    if (!chestItems.contains(text)) {
                        chestItems.add(0, text);
                    }
                }
            } else if (input.contains("Drop")) {
                int index = Integer.parseInt(items[1]);
                if (index>= 0 && index<= chestItems.size()-1) {
                    String item = chestItems.get(index);
                    chestItems.remove(item);
                    chestItems.add(item);
                }

            } else if (input.contains("Steal")) {
                int countSteel = Integer.parseInt(items[1]);
                   if (countSteel >= chestItems.size()-1) {
                       for (int i = 0; i < chestItems.size(); i++) {
                           String  item = chestItems.get(i);
                           if (i == chestItems.size()-1) {
                               System.out.print(item);
                           } else {
                               System.out.print(item + ", ");
                           }
                       }

                       chestItems.removeAll(chestItems);
                       isEmpty = true;
                   } else {
                       for (int i = countSteel; i >= 1 ; i--) {
                           String steelitem = chestItems.get((chestItems.size()) - i);
                           if (i == 1){
                               System.out.print(steelitem);
                           } else {
                               System.out.print(steelitem + ", ");
                           }
                           chestItems.remove(steelitem);
                       }

                   }
                System.out.println();

                 }

            input = scanner.nextLine();
        }
        if (isEmpty) {
            System.out.println("Failed treasure hunt.");
        } else {
            int count = 0;
            int sum = 0;
            for (String lent : chestItems) {
                count++;
                int lentTWord = lent.length();
                sum += lentTWord;
            }
            double averageresult = sum * 1.0 / count;
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageresult);



        }



    }
}
