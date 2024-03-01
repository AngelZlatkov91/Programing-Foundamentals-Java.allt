package ArraysListBasics.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scanner.nextLine();
        List<Character> allSymbol = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char textSymbol = text.charAt(i);
            allSymbol.add(textSymbol);
        }

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int currentSum = 0;
            while (currentNum >0) {
                currentSum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (currentSum <=text.length()-1) {
                char symbol = allSymbol.get(currentSum);
                message.append(symbol);
                allSymbol.remove(currentSum);
            } else {
                int diff = currentSum - allSymbol.size();
                char symbol = text.charAt(diff);
                message.append(symbol);
                allSymbol.remove(diff);
                }
            }


        System.out.println(message);




















    }
}
