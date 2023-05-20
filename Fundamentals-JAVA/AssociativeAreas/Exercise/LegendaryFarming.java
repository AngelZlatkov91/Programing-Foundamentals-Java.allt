package AssociativeAreas.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaryItem = new LinkedHashMap<>();
        legendaryItem.put("shards", 0);
        legendaryItem.put("fragments", 0);
        legendaryItem.put("motes", 0);

        Map<String , Integer> junks = new LinkedHashMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String [] allMaterial = scanner.nextLine().split("\\s+");
            for (int i = 0; i < allMaterial.length; i+=2) {
                int quantity = Integer.parseInt(allMaterial[i]);
                String material = allMaterial[i+1].toLowerCase();
                if (legendaryItem.containsKey(material)) {
                    int curentFragments = legendaryItem.get(material);
                    legendaryItem.put(material,curentFragments + quantity);
                } else {
                    if (!junks.containsKey(material)) {
                        junks.put(material,0);
                    }
                    int currentJunks = junks.get(material);
                    junks.put(material,currentJunks + quantity);
                }
                if (legendaryItem.get("shards") >= 250) {
                    int currentQuantity = legendaryItem.get("shards");
                    legendaryItem.put("shards",currentQuantity - 250);
                    System.out.println("Shadowmourne obtained!");
                    isObtained = true;
                    break;
                } else if (legendaryItem.get("fragments") >= 250) {
                    int currentQuantity = legendaryItem.get("fragments");
                    legendaryItem.put("fragments",currentQuantity - 250);
                    System.out.println("Valanyr obtained!");
                    isObtained = true;
                    break;

                } else if (legendaryItem.get("motes") >= 250) {
                    int currentQuantity = legendaryItem.get("motes");
                    legendaryItem.put("motes",currentQuantity - 250);
                    System.out.println("Dragonwrath obtained!");
                    isObtained = true;
                    break;
                }

            }
            if (isObtained){
                break;
            }

        }
        legendaryItem.forEach((key, value) -> System.out.println(key +": " + value));
        junks.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
