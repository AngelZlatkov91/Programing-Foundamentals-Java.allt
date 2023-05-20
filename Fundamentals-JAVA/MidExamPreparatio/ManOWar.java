package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       int maximumHealth = Integer.parseInt(scanner.nextLine());
         boolean isWon = false;
         boolean isLoss = false;

       String input = scanner.nextLine();
       while (!input.equals("Retire")) {
         String[] command = input.split(" ");
         if (input.contains("Fire")) {
           int index = Integer.parseInt(command[1]);
           int damage = Integer.parseInt(command[2]);
           if (index>=0 && index <= warShip.size()-1) {
               int section = warShip.get(index);
               if ((section - damage) > 0) {
                   warShip.remove(index);
                   warShip.add(index, section - damage);
               } else {
                   isWon = true;
                   break;
               }
           }

         } else if (input.contains("Defend")) {
             int startIndex = Integer.parseInt(command[1]);
             int endIndex = Integer.parseInt(command[2]);
             int damage = Integer.parseInt(command[3]);
             if (startIndex >= 0 && startIndex<= pirateShip.size()-1){
                 if (endIndex >= 0 && endIndex<= pirateShip.size()-1){
                     for (int index = startIndex; index <=endIndex ; index++) {
                         int pirateIndex = pirateShip.get(index);
                         if (pirateIndex - damage >0) {
                             pirateShip.remove(index);
                             pirateShip.add(index,pirateIndex - damage);
                         } else {
                             isLoss = true;
                             break;
                         }
                     }

                 }
             }

         } else if (input.contains("Repair")) {
            int index = Integer.parseInt(command[1]);
            int health = Integer.parseInt(command[2]);
            if (index >=0 && index<= pirateShip.size()-1) {
                int needHealth = pirateShip.get(index);
                if (needHealth + health <= maximumHealth) {
                    pirateShip.remove(index);
                    pirateShip.add(index,needHealth + health);
                } else {
                    pirateShip.remove(index);
                    pirateShip.add(index,maximumHealth);
                }
            }
         } else if (input.contains("Status")) {
          double procent = maximumHealth * 1.0 / 5;
          int count = 0;
             for (int smallHelath : pirateShip) {
                 if (smallHelath < procent) {
                     count++;
                 }
             }
             System.out.println(count + " sections need repair.");
         }


           input = scanner.nextLine();
       }
       if (isWon) {
           System.out.println("You won! The enemy ship has sunken.");
       } else if (isLoss) {
           System.out.println("You lost! The pirate ship has sunken.");
       } else {
           int sumpirat =0;
           for (int piratSum : pirateShip) {
               sumpirat += piratSum;
           }
           System.out.println("Pirate ship status: " + sumpirat);
           int sum =0;
           for (int warSum : warShip) {
               sum += warSum;
           }
           System.out.println("Warship status: " + sum);


       }

    }
}
