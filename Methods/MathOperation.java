package Methods;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        int b = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        switch (symbol) {
            case '/':
           sum = divide(a,b);
                break;
            case '*':
                sum = multiply(a,b);
                break;
            case '-':
                sum = subtract(a,b);
                break;
            case '+':
                sum = add(a,b);
                break;
        }
        System.out.println(sum);
    }
    private static int divide (int a, int b){
        return a / b;
    }
    private static int multiply (int a, int b) {
        return a * b;
    }
    private static int subtract(int a, int b) {
        return a - b;
    }
    private static int add (int a, int b) {
        return a + b;
    }
}
