package AssociativeArraysMap.Exercise;
import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if (!forceBook.containsKey(team)) {
                    forceBook.put(team, new ArrayList<>());
                }
                 boolean isExist = false;
                for (List<String> list : forceBook.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    forceBook.get(team).add(player);
                }
            } else if (input.contains(" -> ")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];
               forceBook.entrySet().forEach(entry -> entry.getValue().remove(player));
                if (forceBook.containsKey(team)) {
                    List<String> currentPlayers = forceBook.get(team);
                    currentPlayers.add(player);
                } else {
                    forceBook.put(team,new ArrayList<>());
                    forceBook.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n",player,team);
            }
            input = scanner.nextLine();
        }

        forceBook.entrySet()
                .stream().filter(entry -> entry.getValue().size() >0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(players -> System.out.println("! " + players));
                });






    }
}
