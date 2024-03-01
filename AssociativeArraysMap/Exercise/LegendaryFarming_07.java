package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaryItem = new LinkedHashMap<>();
        legendaryItem.put("shards",0);
        legendaryItem.put("fragments",0);
        legendaryItem.put("motes",0);

        Map<String,Integer> junks = new LinkedHashMap<>();

        while (true) {
            boolean isObtained = false;
            String[] material = scanner.nextLine().split(" ");
            for (int i = 0; i < material.length; i+=2) {
                int quantity = Integer.parseInt(material[i]);
                String keyMaterial = material[i + 1].toLowerCase();
                if (legendaryItem.containsKey(keyMaterial)) {
                    int currentQuantity = legendaryItem.get(keyMaterial);
                    legendaryItem.put(keyMaterial, currentQuantity + quantity);
                } else {
                    junks.put(keyMaterial, quantity);
                }

                if (legendaryItem.get("shards") >= 250) {
                    int currentQuantity = legendaryItem.get("shards");
                    legendaryItem.put("shards", currentQuantity - 250);
                    System.out.println("Shadowmourne obtained!");
                    isObtained = true;
                    break;
                } else if (legendaryItem.get("fragments") >= 250) {
                    int currentQuantity = legendaryItem.get("fragments");
                    legendaryItem.put("fragments", currentQuantity - 250);
                    System.out.println("Valanyr obtained!");
                    isObtained = true;
                    break;
                } else if (legendaryItem.get("motes") >= 250) {
                    int currentQuantity = legendaryItem.get("motes");
                    legendaryItem.put("motes", currentQuantity - 250);
                    System.out.println("Dragonwrath obtained!");
                    isObtained = true;
                    break;
                }
            }
            if (isObtained){
                break;
            }
        }
        legendaryItem.forEach((key, value) -> System.out.println(key + ": " + value));
        junks.forEach((key, value) -> System.out.println(key + ": " + value));






    }
}
