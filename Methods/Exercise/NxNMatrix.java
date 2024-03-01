package Methods.Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        matrix(nLine);

    }

    private static void matrix(int nLine) {
        for (int i = 1; i <= nLine; i++) {
            for (int j = 1; j <= nLine; j++) {
                System.out.print(nLine + " ");
            }
            System.out.println();
        }
    }
}
