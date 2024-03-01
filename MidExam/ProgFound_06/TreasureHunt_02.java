package MidExam.ProgFound_06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        boolean isEmpty = false;
         List<String> stealElement = new ArrayList<>();
         String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            if (input.contains("Loot")) {
                loot(treasureChest, input);
            } else if (input.contains("Drop")) {
                drop(treasureChest, input);
            } else if (input.contains("Steal")) {
                int count = Integer.parseInt(input.split(" ")[1]);
                if (count >= treasureChest.size() - 1) {
                    for (int i = 0; i < treasureChest.size(); i++) {
                        String treasure = treasureChest.get(i);
                        if (i == treasureChest.size() - 1) {
                            System.out.print(treasure);
                        } else {
                            System.out.print(treasure + ", ");
                        }
                    }
                    treasureChest.removeAll(treasureChest);
                    isEmpty = true;
                    System.out.println();
                } else {
                    int startIndex = treasureChest.size() - count;
                    for (int i = startIndex; i < treasureChest.size(); i++) {
                        String element = treasureChest.get(i);
                        stealElement.add(element);
                    }
                    for (int i = 0; i < stealElement.size(); i++) {
                        String stealEl = stealElement.get(i);
                        treasureChest.remove(stealEl);
                        if (i == stealElement.size() - 1) {
                            System.out.print(stealEl);
                        } else {
                            System.out.print(stealEl + ", ");
                        }
                    }
                    System.out.println();
                }
            }
            input = scanner.nextLine();
        }
        if (isEmpty) {
            System.out.println("Failed treasure hunt.");
        } else {
            double average = 0;
            for (String leftElement : treasureChest) {
                average += leftElement.length();
            }
            average = average / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",average);



        }


    }

    private static void drop(List<String> treasureChest, String input) {
        int index = Integer.parseInt(input.split(" ")[1]);
        if (index >=0 && index<= treasureChest.size()-1) {
            String dropElement = treasureChest.get(index);
            treasureChest.remove(dropElement);
            treasureChest.add(dropElement);
        }
    }

    private static void loot(List<String> treasureChest, String input) {
        String[] lootElement = input.split(" ");
        for (int i = 1; i < lootElement.length ; i++) {
            String element = lootElement[i];
            if (!treasureChest.contains(element)) {
                treasureChest.add(0,element);
            }
        }
    }
}
