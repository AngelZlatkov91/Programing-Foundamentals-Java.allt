package MidExamPreparatio;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int countWin = 0;

          boolean isFail = false;
        while (!input.equals("End of battle")) {
          int battle = Integer.parseInt(input);
          if ((initialEnergy - battle) < 0) {
              isFail = true;
              break;
          } else {
              countWin++;
              initialEnergy -= battle;
              if (countWin % 3 == 0) {
                  initialEnergy += countWin;
              }
          }

            input = scanner.nextLine();
        }
        if (isFail){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countWin,initialEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d",countWin,initialEnergy);
        }

    }
}
