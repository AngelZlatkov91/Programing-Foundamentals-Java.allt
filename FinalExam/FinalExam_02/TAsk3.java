package FinalExam.FinalExam_02;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class TAsk3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> dataPlant = new LinkedHashMap<>();
        Map<String,Double> rateMap = new LinkedHashMap<>();
        for (int i = 0; i < nLine; i++) {
            String[] plantsAndRarity = scanner.nextLine().split("<->");
            String plant = plantsAndRarity[0];
            int rarity = Integer.parseInt(plantsAndRarity[1]);
            if (!dataPlant.containsKey(plant)) {
                dataPlant.put(plant,rarity);
            } else {
                dataPlant.put(plant,rarity);
            }
            rateMap.put(plant,0.0);
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
          String [] tokens = input.split("[: -]+");
           if (tokens[0].equals("Rate")) {
               String plant = tokens[1];
               double rating = Double.parseDouble(tokens[2]);
               if (dataPlant.containsKey(plant)) {
                   if (rateMap.get(plant) != 0.0) {
                       double currentRating = rateMap.get(plant);
                       rateMap.put(plant, (currentRating + rating) / 2);
                   } else {
                       rateMap.put(plant, rating);
                   }
               } else {
                   System.out.println("error");
               }
               
           } else if (tokens[0].equals("Update")) {
               String plant = tokens[1];
               int rarity = Integer.parseInt(tokens[2]);
               if (dataPlant.containsKey(plant)) {
                   dataPlant.put(plant,rarity);
               } else {
                   System.out.println("error");
               }
               
           } else if (tokens[0].equals("Reset")) {
               String plant = tokens[1];
               if (rateMap.containsKey(plant)) {
                   rateMap.put(plant,0.0);
               } else {
                   System.out.println("error");
               }
           }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : dataPlant.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double rating = rateMap.get(entry.getKey());
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",plant,rarity,rating);
        }


    }
}
