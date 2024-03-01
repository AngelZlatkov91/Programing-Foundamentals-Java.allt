package MidExam.ProgFound_06;

import java.util.Arrays;
import java.util.Scanner;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] warShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            if (input.contains("Fire")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int damage = Integer.parseInt(input.split(" ")[2]);
                if (index>=0 && index<= warShip.length-1) {
                    int currentHealth = warShip[index];
                    warShip[index] = currentHealth - damage;
                    if (warShip[index] <=0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
            } else if (input.contains("Defend")) {
                int startIndex = Integer.parseInt(input.split(" ")[1]);
                int endIndex = Integer.parseInt(input.split(" ")[2]);
                int damage = Integer.parseInt(input.split(" ")[3]);
                if (startIndex >=0 && startIndex<= pirateShip.length-1 && endIndex >=0 && endIndex<= pirateShip.length-1) {
                    for (int i = startIndex; i <=endIndex ; i++) {
                        int currentHealth = pirateShip[i];
                        pirateShip[i] = currentHealth - damage;
                        if (pirateShip[i] <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }

            } else if (input.contains("Repair")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int health = Integer.parseInt(input.split(" ")[2]);
                if (index >=0 && index <= pirateShip.length-1) {
                    int currentHealth = pirateShip[index];
                    pirateShip[index] = Math.min(health + currentHealth, maxHealth);
                }
            } else if (input.contains("Status")) {
                int count =0;
                for (int ship : pirateShip) {
                    int lowerHealth = maxHealth  / 5;
                    if (ship < lowerHealth) {
                        count++;
                    }
                }
                System.out.println(count + " sections need repair.");
            }


            input = scanner.nextLine();
        }
        int sumPirateShip = 0;
        int warShipSum = 0;
        for (int shipPirate: pirateShip) {
            sumPirateShip +=shipPirate;
        }
        for (int shipWar : warShip) {
            warShipSum += shipWar;
        }
        System.out.println("Pirate ship status: " + sumPirateShip);
        System.out.println("Warship status: " + warShipSum);



    }
}