package AssociativeArraysMap.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCommands = Integer.parseInt(scanner.nextLine());

        Map<String,String> userNameAndNumber = new LinkedHashMap<>();
        for (int i = 1; i <= nCommands ; i++) {
            String [] registerNumber = scanner.nextLine().split("\\s+");
            if (registerNumber[0].equals("register")) {
                String name = registerNumber[1];
                String number = registerNumber[2];
                if (!userNameAndNumber.containsKey(name)) {
                    userNameAndNumber.put(name, number);
                    System.out.println(name + " registered " + number + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + userNameAndNumber.get(name));
                }

            } else if (registerNumber[0].equals("unregister")) {
                String name = registerNumber[1];
              if (userNameAndNumber.containsKey(name)) {
                  userNameAndNumber.remove(name);
                  System.out.println(name + " unregistered successfully");
              } else {
                  System.out.println("ERROR: user " + name + " not found");
              }

            }

        }
        userNameAndNumber.forEach((key, value ) -> System.out.println(key + " => " + value));




    }
}
