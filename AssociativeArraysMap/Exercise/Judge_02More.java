package AssociativeArraysMap.Exercise;
import java.util.*;

public class Judge_02More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Map<String , Integer>> judge = new TreeMap<>();
         Map<String,Integer> individualStand = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
           String name = input.split(" -> ")[0];
           String contest = input.split(" -> ")[1];
           int points = Integer.parseInt(input.split(" -> ")[2]);
            if (!judge.containsKey(contest)) {
                judge.put(contest, new TreeMap<>());
            }
            judge.get(contest).put(name,points);

            if (!individualStand.containsKey(name)) {
                individualStand.put(name,0);
            }
            int currentPoint = individualStand.get(name);
            individualStand.put(name,currentPoint + points);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : judge.entrySet()) {
            System.out.println(entry.getKey()+ ": " + entry.getValue().size() + " participants");
            int count = 1;
            for (Map.Entry<String, Integer> entryValue : entry.getValue().entrySet()) {

                System.out.println(count + ". " + entryValue.getKey() + " <::> " + entryValue.getValue());
                count++;
            }
        }

        System.out.println("Individual standings");
        int count = 1;
        for (Map.Entry<String, Integer> entry : individualStand.entrySet()) {
            System.out.println(count+ ". " + entry.getKey() + " -> " + entry.getValue());
            count++;
        }


    }
}
