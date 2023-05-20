package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condesed = new int[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            if (nums.length==1){
                break;
            }
            if (i == nums.length -1) {
                int[] condensedNew = new int[condesed.length-1];
                i-=1;
                nums= condesed;
                condesed = condensedNew;

            } else {
                condesed[i] = nums[i] + nums[i+1];
            }


            System.out.println(nums[0]);
        }



    }
}
