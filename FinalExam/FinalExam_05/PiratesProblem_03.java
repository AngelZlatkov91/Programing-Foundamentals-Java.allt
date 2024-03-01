package FinalExam.FinalExam_05;

import java.util.*;

public class PiratesProblem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> sailList = new LinkedHashMap<>();
        int count = 0;
        String firstCommand = scanner.nextLine();
        while (!firstCommand.equals("Sail")) {
            String [] command = firstCommand.split("\\|\\|");
           String name = command[0];
           int population = Integer.parseInt(command[1]); // na 0 index
           int gold = Integer.parseInt(command[2]);   // na 1 index
          List<Integer> populationAndGold = new ArrayList<>();
          populationAndGold.add(population);
          populationAndGold.add(gold);
          if (!sailList.containsKey(name)) {
              sailList.put(name,populationAndGold);
              count++;
          } else {
              int currentPopulation = sailList.get(name).get(0);
              int currentGold = sailList.get(name).get(1);
              sailList.get(name).set(0,currentPopulation + population);
              sailList.get(name).set(1,currentGold + gold);
          }
            firstCommand = scanner.nextLine();
        }

        String secondCommand = scanner.nextLine();
        while (!secondCommand.equals("End")) {
            if (secondCommand.contains("Plunder")) {
                String town = secondCommand.split("=>")[1];
                int people = Integer.parseInt(secondCommand.split("=>")[2]);
                int gold = Integer.parseInt(secondCommand.split("=>")[3]);
                int currentPopulation = sailList.get(town).get(0);
                int currentGold = sailList.get(town).get(1);
                sailList.get(town).set(0,currentPopulation - people);
                sailList.get(town).set(1,currentGold - gold);
                System.out.println(town + " plundered! " + gold + " gold stolen, " + people + " citizens killed.");
                if (sailList.get(town).get(0) <=0 || sailList.get(town).get(1) <=0) {
                    sailList.remove(town);
                    System.out.println(town + " has been wiped off the map!");
                    count--;
                }

            } else if (secondCommand.contains("Prosper")) {
                String town = secondCommand.split("=>")[1];
                int gold = Integer.parseInt(secondCommand.split("=>")[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = sailList.get(town).get(1);
                    sailList.get(town).set(1,currentGold + gold);
                    System.out.println(gold+" gold added to the city treasury. "+town+" now has "+sailList.get(town).get(1)+" gold.");
                }
            }


            secondCommand = scanner.nextLine();
        }
        if (sailList.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println("Ahoy, Captain! There are "+count+" wealthy settlements to go to:");
            for (Map.Entry<String, List<Integer>> entry : sailList.entrySet()) {
                String town = entry.getKey();
                int population = entry.getValue().get(0);
                int gold = entry.getValue().get(1);
                System.out.println(town+" -> Population: "+population+" citizens, Gold: "+gold+" kg");

            }

        }






    }
}
