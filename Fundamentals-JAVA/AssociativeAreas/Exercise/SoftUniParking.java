package AssociativeAreas.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int nTime = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingList = new LinkedHashMap<>();


        for (int i = 1; i <= nTime ; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String register = command[0];
            String name = command[1];

            if (register.equals("register")) {
                String number = command[2];
                if (!parkingList.containsKey(name)) {
                    parkingList.put(name,number);
                    System.out.println(name + " registered " + number + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + parkingList.get(name));
                }

            }else if (register.equals("unregister")) {
               if (!parkingList.containsKey(name)) {
                   System.out.println("ERROR: user " + name + " not found");
               } else {
                   parkingList.remove(name);
                   System.out.println(name + " unregistered successfully");
               }

            }
        }

        parkingList.forEach((key, value) -> System.out.println(key + " => " + value));





    }
}
