package AssociativeAreas;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> synonyms = new LinkedHashMap<>();

        for (int i = 1; i <=count ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<>());
            }
            synonyms.get(word).add(synonym);
        }


        for (Map.Entry<String, ArrayList<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }


    }
}
