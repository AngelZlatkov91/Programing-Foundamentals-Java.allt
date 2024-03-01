package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String [] text = scanner.nextLine().split("\\s+");
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (String word : text) {

            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                if (!charCount.containsKey(symbol)) {
                    charCount.put(symbol,0);
                }
                charCount.put(symbol, charCount.get(symbol) + 1);

            }
        }


      charCount.forEach((key , value) -> System.out.println(key + " -> " + value));



    }
}
