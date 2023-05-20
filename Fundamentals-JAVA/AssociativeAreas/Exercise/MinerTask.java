package AssociativeAreas.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> minerTask = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int price = Integer.parseInt(scanner.nextLine());
            if (!minerTask.containsKey(input)) {
                minerTask.put(input,0);
            }
            int currentPrice = minerTask.get(input);
            minerTask.put(input, currentPrice + price);

            input = scanner.nextLine();
        }
        minerTask.forEach((key, value)-> System.out.println(key + " -> " + value));




    }
}
