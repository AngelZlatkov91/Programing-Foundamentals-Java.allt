package Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        startLine(nLine);
        endLine(nLine);
    }
    private static void startLine(int nLine) {
        for (int i = 1; i <= nLine; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    private static void endLine(int nLine) {
        for (int i = nLine -1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
