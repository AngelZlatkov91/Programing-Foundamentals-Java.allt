package AssociativeAreas;

import java.util.*;

public class countRealNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double,Integer> countNum = new TreeMap<>();

        for (double num : numbers) {
            if (!countNum.containsKey(num)) {
                countNum.put(num,0);
            }
            int currentCount = countNum.get(num);
            countNum.put(num,currentCount + 1);
        }

        for (Map.Entry<Double, Integer> doubleDoubleEntry : countNum.entrySet()) {
            System.out.printf("%.0f -> %d%n",doubleDoubleEntry.getKey(),doubleDoubleEntry.getValue());
        }


    }
}
