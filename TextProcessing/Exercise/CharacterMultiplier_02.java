package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String firstTExt = text.split(" ")[0];
        String secondTExt = text.split(" ")[1];

        int minLenth = Math.min(firstTExt.length(),secondTExt.length());
        int sum = 0;
        for (int i = 0; i < minLenth; i++) {
            sum = sum +  (firstTExt.charAt(i) * secondTExt.charAt(i));
        }


        if (firstTExt.length() > secondTExt.length()) {
            sum = getSum(firstTExt, secondTExt, sum);
        } else if (secondTExt.length() > firstTExt.length()) {
            sum = getSum(secondTExt, firstTExt, sum);
        }
        System.out.println(sum);


    }

    private static int getSum(String firstTExt, String secondTExt, int sum) {
        for (int i = secondTExt.length(); i < firstTExt.length() ; i++) {
            sum += firstTExt.charAt(i);
        }
        return sum;
    }
}
