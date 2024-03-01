package AssociativeArraysMap;


import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words =scanner.nextLine().split("\\s+");

        Map<String, Integer> occurrences = new LinkedHashMap<>();


        for (String word : words) {
            String currentWord = word.toLowerCase();
            if (!occurrences.containsKey(currentWord)) {
                occurrences.put(currentWord,0);
            }
            occurrences.put(currentWord, occurrences.get(currentWord) + 1);
        }
        List<String> allWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                allWords.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ",allWords));


    }
}
