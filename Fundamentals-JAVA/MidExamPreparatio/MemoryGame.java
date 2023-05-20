package MidExamPreparatio;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

         boolean isEmpti = false;
        String input = scanner.nextLine();
         int countMovies = 0;
        while (!input.equals("end")) {
            countMovies++;
           String [] tokens = input.split("\\s+");
          int firstIndex = Integer.parseInt(tokens[0]);
          int secondIndex = Integer.parseInt(tokens[1]);
          if ((firstIndex == secondIndex) || (firstIndex < 0 || firstIndex >= elementsList.size()) || secondIndex < 0 || secondIndex >= elementsList.size()) {
              System.out.println("Invalid input! Adding additional elements to the board");
              elementsList.add(elementsList.size()/2,String.format("-%da",countMovies));
              elementsList.add(elementsList.size()/2,String.format("-%da",countMovies));

            }
          else  {
              if (elementsList.get(firstIndex).equals(elementsList.get(secondIndex))) {
                  System.out.printf("Congrats! You have found matching elements - %s!%n", elementsList.get(firstIndex));
                  String remove = elementsList.get(firstIndex);
                  elementsList.remove(firstIndex);
                  elementsList.remove(remove);
              } else {
                  System.out.println("Try again!");
              }

          }

            if (elementsList.size()== 0){
                isEmpti = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (isEmpti) {
            System.out.printf("You have won in %d turns!", countMovies);
        } else {
            System.out.println("Sorry you lose :(");
            for (String result : elementsList) {
                System.out.print(result + " ");
            }
        }


    }
}
