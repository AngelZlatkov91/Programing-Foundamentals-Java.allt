package ListArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondNumList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

           List<Integer> resultList = new ArrayList<>();
        if (firstNumList.size() >= secondNumList.size()) {
            for (int i = 0; i < secondNumList.size(); i++) {
                resultList.add(firstNumList.get(i));
                resultList.add(secondNumList.get(i));
            }

        } else {
            for (int i = 0; i < firstNumList.size(); i++) {
                resultList.add(firstNumList.get(i));
                resultList.add(secondNumList.get(i));
            }

        }

        if (firstNumList.size()>secondNumList.size()) {
            resultList.addAll(firstNumList.subList(secondNumList.size(),firstNumList.size()));
        } else {
            resultList.addAll(secondNumList.subList(firstNumList.size(),secondNumList.size()));
        }
        for (int result : resultList) {
            System.out.print(result + " ");
        }





    }
}
