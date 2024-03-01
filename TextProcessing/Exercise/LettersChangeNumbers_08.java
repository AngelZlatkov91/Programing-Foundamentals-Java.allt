package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] codes = input.split("\\s+");

        double totalSum = 0;
        totalSum = getTotalSum(codes, totalSum);
        System.out.printf("%.2f",totalSum);
    }

    private static double getTotalSum(String[] codes, double totalSum) {
        for (String code : codes) {
          char firstSymbol = code.charAt(0);
          char lastSymbol = code.charAt(code.length()-1);
          double num = Double.parseDouble(code.replace(firstSymbol, ' ')
                  .replace(lastSymbol, ' ')
                  .trim());
          if (Character.isUpperCase(firstSymbol)) {
              int position = (int) firstSymbol - 64;
              num = num / position;
          } else {
              int position = (int) firstSymbol - 96;
              num = num * position;
          }
          if (Character.isUpperCase(lastSymbol)) {
              int position = (int) lastSymbol -64;
              num = num - position;
          } else {
              int position = (int) lastSymbol - 96;
              num = num + position;
          }
          totalSum += num;

        }
        return totalSum;
    }

}
