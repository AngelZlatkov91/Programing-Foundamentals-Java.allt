package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thurNum = Integer.parseInt(scanner.nextLine());
        int fourNum = Integer.parseInt(scanner.nextLine());
        int sum = ((firstNum + secondNum) / thurNum) * fourNum;
        System.out.println(sum);
    }
}
