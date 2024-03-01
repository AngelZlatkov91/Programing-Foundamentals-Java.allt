package DataTypesAndVariables.Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight_02More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=nLines ; i++) {
            String[] digits = scanner.nextLine().split(" ");
             String firstDigit = digits[0];
             String secondDigit = digits[1];
             int [] firstNUmber = Arrays.stream(firstDigit.split(""))
                     .mapToInt(Integer::parseInt)
                     .toArray();
            int [] secondNUmber = Arrays.stream(secondDigit.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int sumOne = 0;
            int sumTwo = 0;

            for (int oneNum : firstNUmber) {
                sumOne += oneNum;
            }
            for (int twoNum : secondNUmber) {
                sumTwo += twoNum;
            }
            if (sumOne >=sumTwo) {
                System.out.println(sumOne);
            } else {
                System.out.println(sumTwo);
            }






        }




    }
}
