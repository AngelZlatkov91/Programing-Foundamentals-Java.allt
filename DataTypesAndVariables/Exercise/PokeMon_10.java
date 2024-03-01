package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int startPositionN = N;
        int count = 0;
        while (N >= M) {
            N = N - M;
            count++;
            if (startPositionN / 2 == N) {
                if (N != 0) {
                    N = N / Y;
                }
            }
        }
        System.out.println(N);
        System.out.println(count);





    }
}
