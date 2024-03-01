package Methods;

import javax.management.InstanceNotFoundException;
import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNUmber = Integer.parseInt(scanner.nextLine());
        int secondNUmber = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add":
                add(firstNUmber,secondNUmber);
                break;
            case "multiply":
                multiply(firstNUmber,secondNUmber);
                break;
            case "subtract":
                subtract(firstNUmber,secondNUmber);
                break;
            case "divide":
                divide(firstNUmber,secondNUmber);
                break;
        }
    }
    private static void add (int a, int b) {
        System.out.println(a + b);
    }
    private static void multiply (int a , int b){
        System.out.println(a * b);
    }
    private static void subtract (int a, int b){
        System.out.println(a - b);
    }
    private  static void divide (int a,int b) {
        System.out.println(a / b);
    }
}
