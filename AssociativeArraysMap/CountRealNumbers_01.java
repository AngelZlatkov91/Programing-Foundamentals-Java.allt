package AssociativeArraysMap;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();


        Map<Double , Integer> countRealNum = new LinkedHashMap<>();

        for (double num : numbers) {
            if (!countRealNum.containsKey(num)) {
                countRealNum.put(num, 0);
            }
            countRealNum.put(num, countRealNum.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : countRealNum.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#####");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()), entry.getValue());
        }


    }
}
