package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> minerTask = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!minerTask.containsKey(input)) {
                minerTask.put(input, 0);
            }
            minerTask.put(input, minerTask.get(input) + quantity);

            input = scanner.nextLine();
        }
        minerTask.forEach((key, value) -> System.out.println(key + " -> " + value));


    }
}
