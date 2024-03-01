package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String [] wordArr = scanner.nextLine().split(" ");
        Random random = new Random();

        for (int i = 0; i < wordArr.length; i++) {
            int rndIndex = random.nextInt(wordArr.length);
            int rndIndexy = random.nextInt(wordArr.length);
            String oldWord = wordArr[rndIndex];
            wordArr[rndIndex] = wordArr[rndIndexy];
            wordArr[rndIndexy] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(),wordArr));
    }
}
