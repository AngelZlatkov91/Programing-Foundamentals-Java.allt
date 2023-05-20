package AssociativeAreas.Exercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split(" ");
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (String word : text) {
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                if (!count.containsKey(symbol)) {
                    count.put(symbol, 0);
                }
                int currentCount = count.get(symbol);
                count.put(symbol,currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
