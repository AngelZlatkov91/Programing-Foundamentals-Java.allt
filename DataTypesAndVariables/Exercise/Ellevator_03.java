package DataTypesAndVariables.Exercise;
import java.util.Scanner;

public class Ellevator_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int person = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) person / capacity);
        System.out.println(courses);

    }
}
