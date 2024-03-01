package FinalExam.FinalExam_02;

import java.util.*;

public class PlanDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> plantRarity = new LinkedHashMap<>();
        for (int i = 1; i <=nLines ; i++) {
            String [] plants = scanner.nextLine().split("<->");
            String plant = plants[0];
            int rarity = Integer.parseInt(plants[1]);
            List<Integer> ratingAndCount = new ArrayList<>();
            ratingAndCount.add(rarity); // na 0 e rarity
            ratingAndCount.add(0);   // na 1 e rate
            ratingAndCount.add(0);   // na 2 e count
            if (!plantRarity.containsKey(plant)) {
                plantRarity.put(plant,ratingAndCount);
            } else {
                plantRarity.get(plant).remove(0);
                plantRarity.get(plant).add(0,rarity);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            if (input.contains("Rate")) {
                String[] command = input.split(": ")[1].split(" - ");
                String name = command[0];
                int newRarity = Integer.parseInt(command[1]);
                if (plantRarity.containsKey(name)) {
                    if (plantRarity.get(name).size()-1 > 0) {
                        int currentRating = plantRarity.get(name).get(1);
                        int currentCount = plantRarity.get(name).get(2);
                        plantRarity.get(name).set(1, currentRating + newRarity);
                        plantRarity.get(name).set(2, currentCount + 1);
                    } else {
                        plantRarity.get(name).add(newRarity);
                        plantRarity.get(name).add(1);
                    }
                } else {
                    System.out.println("error");
                }
            } else if (input.contains("Update")) {
                String[] command = input.split(": ")[1].split(" - ");
                String name = command[0];
                int newRarity = Integer.parseInt(command[1]);
                if (plantRarity.containsKey(name)) {
                    plantRarity.get(name).set(0,newRarity);
                } else {
                    System.out.println("error");
                }
            } else if (input.contains("Reset")) {
                String command = input.split(": ")[1];
                if (plantRarity.containsKey(command)) {
                    if (plantRarity.get(command).size()-1 > 0) {
                        plantRarity.get(command).remove(1);
                        plantRarity.get(command).remove(1);
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            }


            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Integer>> entry : plantRarity.entrySet()) {
            String name = entry.getKey();
            int rarity = entry.getValue().get(0);
            if (entry.getValue().size() - 1 > 0) {
                double rating = entry.getValue().get(1) * 1.0 / entry.getValue().get(2);
                System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, rating);
            } else {
                System.out.printf("- %s; Rarity: %d; Rating: 0.00%n", name, rarity);

            }

        }
    }
}
