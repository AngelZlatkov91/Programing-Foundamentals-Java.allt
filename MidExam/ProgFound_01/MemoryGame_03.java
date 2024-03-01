package MidExam.ProgFound_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
            .collect(Collectors.toList());
       boolean isEmpty = false;
     int countMovie = 0;
    String input = scanner.nextLine();
    while (!input.equals("end")) {
        countMovie++;
        int firstIndex = Integer.parseInt(input.split(" ")[0]);
        int secondIndex = Integer.parseInt(input.split(" ")[1]);
        if (firstIndex == secondIndex || firstIndex <0 || secondIndex<0 || firstIndex > elements.size()-1
                || secondIndex > elements.size()-1) {
            System.out.println("Invalid input! Adding additional elements to the board");
             elements.add(elements.size()/2,"-"+countMovie+"a" );
             elements.add(elements.size()/2,"-"+countMovie+"a" );
        } else {
            String firstElement = elements.get(firstIndex);
            String secondElement = elements.get(secondIndex);
            if (!firstElement.equals(secondElement)) {
                System.out.println("Try again!");
            } else {
                System.out.println("Congrats! You have found matching elements - " + firstElement + "!");
                elements.remove(firstElement);
                elements.remove(firstElement);
            }
        }
        if (elements.isEmpty()) {
            isEmpty = true;
            break;
        }

        input = scanner.nextLine();
    }
    if (isEmpty) {
        System.out.println("You have won in " + countMovie + " turns!");
    } else {
        System.out.println("Sorry you lose :(");
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }


  }
}
