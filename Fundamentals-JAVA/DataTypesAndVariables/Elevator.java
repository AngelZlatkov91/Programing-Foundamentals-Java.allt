package DataTypesAndVariables;

import java.util.Map;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) peopleNum / capacity);
        System.out.println(courses);


    }
}
