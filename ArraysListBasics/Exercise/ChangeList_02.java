package ArraysListBasics.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<Integer> digitsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Delete")) {
                int deleteNum =Integer.parseInt(input.split(" ")[1]);
                // премахва вси еднакви елементи (номера)
                digitsList.removeAll(Collections.singleton(deleteNum));
            } else if (input.contains("Insert")) {
                int element =Integer.parseInt(input.split(" ")[1]);
                int position =Integer.parseInt(input.split(" ")[2]);
                digitsList.add(position,element);
            }
            input = scanner.nextLine();
        }
        System.out.print(digitsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
