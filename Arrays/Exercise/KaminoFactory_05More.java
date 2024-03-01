package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_05More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLent = Integer.parseInt(scanner.nextLine());
         int [] dna = new int[nLent];
         int bestDna = Integer.MIN_VALUE;
         int count =0;
        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            int[] firstDna = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
             int sum = 0;
            for (int i = 0; i < firstDna.length; i++) {
                int currentDna = firstDna[i];
                sum += currentDna;

            }




            input = scanner.nextLine();
        }





    }
}
