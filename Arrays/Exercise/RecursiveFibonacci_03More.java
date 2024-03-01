package Arrays.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(fibonacci(n));
    }
    public static int fibonacci (int n) {
        if (n == 0) return  0;
        if (n == 1) return  1;
        return fibonacci(n - 1) + fibonacci( n - 2);
    }
}
