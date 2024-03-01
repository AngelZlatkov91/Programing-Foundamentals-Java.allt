package MidExam.ProgFound_03;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int health = Integer.parseInt(scanner.nextLine());
          int wins = 0;
          boolean isLost = false;
          String input = scanner.nextLine();
          while (!input.equals("End of battle")) {
              int distance = Integer.parseInt(input);
              if ((health - distance) < 0) {
                  isLost=true;
                  break;
              }
             health-=distance;
             wins++;
             if (wins % 3 ==0) {
                 health+=wins;
             }
             input = scanner.nextLine();
          }
          if (isLost) {
              System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wins,health);
          } else {
              System.out.printf("Won battles: %d. Energy left: %d",wins,health);
          }




    }
}
