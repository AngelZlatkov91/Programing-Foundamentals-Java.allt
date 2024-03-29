package Methods.Exercise;


import java.util.Map;
import java.util.Scanner;

public class CenterPoint_02More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        centerPoint(x1, y1, x2, y2);

    }

    private static void centerPoint(int x1, int y1, int x2, int y2) {
        int xy1 = Math.abs(x1 + y1);
        int xy2 = Math.abs(x2 + y2);

        if (xy1 <= xy2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
