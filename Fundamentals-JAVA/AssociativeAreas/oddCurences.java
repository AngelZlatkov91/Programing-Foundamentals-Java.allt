package AssociativeAreas;

import java.util.*;

public class oddCurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : text) {
            String wordCase = word.toLowerCase();
            if (!counts.containsKey(wordCase)) {
                counts.put(wordCase,0);
            }
            int currentCount = counts.get(wordCase);
            counts.put(wordCase,currentCount + 1);
        }
        List<String> words = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                words.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",words));


    }
}
