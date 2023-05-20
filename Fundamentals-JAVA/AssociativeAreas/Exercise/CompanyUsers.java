package AssociativeAreas.Exercise;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Map<String, ArrayList<String>> usersCompany = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String [] commands = input.split(" -> ");
            String companyName = commands[0];
            String employeeId = commands[1];
            if (!usersCompany.containsKey(companyName)) {
                usersCompany.put(companyName, new ArrayList<>());
            }
            if (!usersCompany.get(companyName).contains(employeeId)) {
                usersCompany.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : usersCompany.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("-- " + String.join("\n-- " ,entry.getValue()));

        }


    }
}
