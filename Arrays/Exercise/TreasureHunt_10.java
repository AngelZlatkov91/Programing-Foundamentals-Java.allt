package Arrays.Exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String [] command = input.split(" ");
            if (input.contains("Loot")) {
                for (int i = 1; i < command.length ; i++) {
                    String lootItem = command[i];
                    if (!treasure.contains(lootItem)) {
                        treasure.add(0,lootItem);
                    }
                }

            } else if (input.contains("Drop")) {
                int index = Integer.parseInt(command[1]);
                if (index >=0 && index <= treasure.size()-1) {
                    String itemRemove = treasure.get(index);
                    treasure.remove(itemRemove);
                    treasure.add(itemRemove);
                }
                
            } else if (input.contains("Steal")) {
                int index = Integer.parseInt(command[1]);
                if (index >= treasure.size()-1) {
                    for (int i = 0; i < treasure.size(); i++) {
                        String stealItem = treasure.get(i);
                        if (i == treasure.size() - 1) {
                            System.out.print(stealItem);
                        } else {
                            System.out.print(stealItem + ", ");
                        }

                    }
                    treasure.removeAll(treasure);

                }else {
                    int currentIndex = treasure.size() - index;
                    for (int i = currentIndex; i < treasure.size() ; i++) {
                        String stealItem = treasure.get(i);
                        if (i == treasure.size()-1) {
                            System.out.print(stealItem);
                        } else {
                            System.out.print(stealItem + ", ");
                        }

                    }
                    for (int j = 1; j <=index ; j++) {
                        treasure.remove(treasure.size()-1);
                    }
                }
            }

            input = scanner.nextLine();
        }
      if (treasure.isEmpty()) {
          System.out.println("Failed treasure hunt.");
      } else {
          int allLength = 0;
          for (String averageLength : treasure) {
              int length = averageLength.length();
              allLength += length;
          }
          double average = allLength * 1.0 / treasure.size();
          System.out.println();
          System.out.printf("Average treasure gain: %.2f pirate credits.",average);
      }



    }
}
