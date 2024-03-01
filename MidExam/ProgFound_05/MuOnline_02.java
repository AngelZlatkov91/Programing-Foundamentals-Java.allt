package MidExam.ProgFound_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int health = 100;
       int bitcoins = 0;
       int bestRoom = 0;
       boolean isDead = false;
        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        for (String currentDungeon : dungeonRooms) {
            String command = currentDungeon.split(" ")[0];
            int number = Integer.parseInt(currentDungeon.split(" ")[1]);
            bestRoom++;
            if (command.equals("potion")) {
                int diff =100 - health;
                if (health + number > 100) {
                    health = 100;
                    System.out.println("You healed for " + diff + " hp.");
                    System.out.println("Current health: " + health + " hp.");
                } else {
                    health = health + number;
                    System.out.println("You healed for " + number + " hp.");
                    System.out.println("Current health: " + health + " hp.");
                }

            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.println("You found " + number + " bitcoins.");
            } else {
                health = health - number;
                if (health > 0) {
                    System.out.println("You slayed " + command + ".");
                } else {
                    System.out.println("You died! Killed by " + command + ".");
                    System.out.println("Best room: " + bestRoom);
                    isDead = true;
                    break;
                }
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: "+ bitcoins);
            System.out.println("Health: " + health);
        }






    }
}
