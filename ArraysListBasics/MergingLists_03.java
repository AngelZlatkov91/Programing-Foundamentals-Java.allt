package ArraysListBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
         List<Integer> resultList = new ArrayList<>();
        if (firstList.size() >= secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
               resultList.add(firstList.get(i));
               resultList.add(secondList.get(i));
            }

        } else {
            for (int i = 0; i < firstList.size(); i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));
            }

        }

        if (firstList.size()> secondList.size()) {
            resultList.addAll(firstList.subList(secondList.size(), firstList.size()));
        } else {
            resultList.addAll(secondList.subList(firstList.size(),secondList.size()));
        }
        for (int result : resultList) {
            System.out.print(result + " ");
        }



    }
}
