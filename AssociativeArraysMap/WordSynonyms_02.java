package AssociativeArraysMap;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 1; i <=nLine ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordSynonyms.containsKey(word)) {
                wordSynonyms.put(word, new ArrayList<>());
            }
            wordSynonyms.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }


    }
}
