package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> appendArrays = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());


        Collections.reverse(appendArrays);

        System.out.println(appendArrays.toString()
                .replace("[","")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
