package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> healthInitial = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int initialHealth = 100;
         int bitcoins = 0;
         int maxBitcoins = Integer.MIN_VALUE;
         boolean isDead = false;
         int deadRoom = 0;
        for (int i = 0; i < healthInitial.size(); i++) {
            String command = healthInitial.get(i);
             if (command.contains("potion")) {
                 int health = Integer.parseInt(command.split(" ")[1]);

                 if (health + initialHealth <= 100) {
                     initialHealth += health;
                     System.out.printf("You healed for %d hp.%n",health);
                     System.out.printf("Current health: %d hp.%n",initialHealth);
                 } else {
                     int diff = 100 - initialHealth;
                     initialHealth = 100;
                     System.out.printf("You healed for %d hp.%n",diff);
                     System.out.printf("Current health: %d hp.%n",initialHealth);
                 }
             } else if (command.contains("chest")) {
                 int bitcoin = Integer.parseInt(command.split(" ")[1]);
                 bitcoins += bitcoin;
                 if (bitcoin > maxBitcoins) {
                     maxBitcoins = bitcoin;

                 }

                 System.out.printf("You found %d bitcoins.%n",bitcoin);
             } else {
                 int attackMOnster = Integer.parseInt(command.split(" ")[1]);

                 if ((initialHealth - attackMOnster) > 0 ) {
                     initialHealth -=attackMOnster;
                     String monster = command.split(" ")[0];
                     System.out.printf("You slayed %s.%n",monster);
                 } else {
                     initialHealth = 0;
                     String monster = command.split(" ")[0];
                     System.out.printf("You died! Killed by %s.%n",monster);
                     deadRoom = i;
                     isDead = true;
                     break;


                 }

             }


        }
      if (isDead) {
          System.out.printf("Best room: %d",deadRoom+1);
      } else {
          System.out.println("You've made it!");
          System.out.printf("Bitcoins: %d%n",bitcoins);
          System.out.printf("Health: %d",initialHealth);
      }


    }
}
