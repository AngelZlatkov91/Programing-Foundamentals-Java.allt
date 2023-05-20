package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NPower = Integer.parseInt(scanner.nextLine());
        int MDistance = Integer.parseInt(scanner.nextLine());
        int YFactor = Integer.parseInt(scanner.nextLine());
        int startPower = NPower;
        int count = 0;

        while (NPower >= MDistance) {
            NPower = NPower - MDistance;
            count++;
            if ((startPower / 2) == NPower) {
                if (NPower != 0) {
                    NPower = NPower / YFactor;
                }
            }
        }
        System.out.println(NPower);
        System.out.println(count);










    }
}
