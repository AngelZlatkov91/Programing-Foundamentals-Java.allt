package AssociativeArraysMap.Exercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String users = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            if (!companyUsers.containsKey(users)) {
                companyUsers.put(users, new ArrayList<>());
            }
            if (!companyUsers.get(users).contains(id)) {
                companyUsers.get(users).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyUsers.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("-- " + String.join("\n-- ", entry.getValue()));
            System.out.println();
        }


    }
}
