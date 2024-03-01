package Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNUmber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int tree = Integer.parseInt(scanner.nextLine());

        smallestNum(one, two, tree);
    }

    private static void smallestNum(int one, int two, int tree) {
        if (one <= two && one <= tree) {
            System.out.println(one);
        } else if (two < one && two < tree) {
            System.out.println(two);
        } else {
            System.out.println(tree);
        }
    }
}
