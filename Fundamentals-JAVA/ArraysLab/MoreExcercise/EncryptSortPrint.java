package ArraysLab.MoreExcercise;


import java.util.Arrays;

import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int [] digits = new int[count];
        for (int i = 0; i < count ; i++) {
            String name = scanner.nextLine();
            char[] symbol = name.toCharArray();
            int sum = 0;
            for (int j = 0; j < symbol.length; j++) {
                char charr = symbol[j];
                switch (charr) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        sum = sum + (charr * name.length());
                        break;
                    default:
                      sum = sum + (charr / name.length());
                      break;
                }

            }
            digits[i] = sum;

        }
        Arrays.sort(digits);

        for (int nums : digits) {
            System.out.println(nums);
        }




    }
}
