package Arrays.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EncryptSortPrintArray_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());

        List<Integer> encrypt = new ArrayList<>();
        for (int i = 0; i < nLine ; i++) {
            String text = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < text.length(); j++) {
                char symbol = text.charAt(j);
                switch (symbol) {
                    case'a':
                    case'o':
                    case'u':
                    case'e':
                    case'i':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    sum += symbol * text.length();
                    break;
                    default:
                        sum += symbol / text.length();
                        break;
                }
            }
            encrypt.add(sum);
        }
        Collections.sort(encrypt);
        encrypt.forEach(System.out::println);





    }
}
