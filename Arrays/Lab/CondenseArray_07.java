package Arrays.Lab;
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
         int [] numbers = new int[digits.length-1];

        for (int i = 0; i < digits.length; i++) {
            if (digits.length==1) {
                break;
            }
             if (i == digits.length-1){
                 int [] condesed = new int[numbers.length-1];
                 i-=1;
                 digits = numbers;
                 numbers = condesed;
             } else {
                 numbers[i] = digits[i] + digits[i+1];
             }
        }
        System.out.println(digits[0]);
    }
}
