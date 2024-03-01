package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstText = scanner.nextLine().split(" ");
        String[] secondText = scanner.nextLine().split(" ");
        for (int i = 0; i < secondText.length; i++) {
            for (int j = 0; j < firstText.length; j++) {
                if (secondText[i].equals(firstText[j])) {
                    System.out.print(secondText[i] + " ");
                }
            }
        }

    }
}
