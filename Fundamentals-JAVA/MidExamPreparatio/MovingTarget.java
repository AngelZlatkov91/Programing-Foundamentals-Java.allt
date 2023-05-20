package MidExamPreparatio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersTarget = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.contains("Add"))  {
                int index = Integer.parseInt(input.split(" ")[1]);
                int value = Integer.parseInt(input.split(" ")[2]);
                if (index > numbersTarget.size()-1 || index < 0) {
                    System.out.println("Invalid placement!");
                } else {
                    int num  = numbersTarget.get(index);
                    numbersTarget.remove(index);
                    numbersTarget.add(index,value+num);
                }
            } else if (input.contains("Shoot")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int power = Integer.parseInt(input.split(" ")[2]);
                if (index>=0 && index<= numbersTarget.size()-1) {
                    int getNum = numbersTarget.get(index);

                    if (getNum > power) {
                        numbersTarget.remove(index);
                      numbersTarget.add(index,getNum - power);
                    } else {
                        numbersTarget.remove(index);
                    }
                }
            } else if (input.contains("Strike")) {
                boolean isInvalid = false;
                int index = Integer.parseInt(input.split(" ")[1]);
                int radius = Integer.parseInt(input.split(" ")[2]);
              if (index > 0 && index < numbersTarget.size()-1) {
                  for (int i = 0; i < numbersTarget.size(); i++) {
                      if (i == index) {
                          if (i+radius<=numbersTarget.size()-1 && i-radius>=0) {
                              numbersTarget.remove(i);
                              numbersTarget.remove(i);
                              numbersTarget.remove(i-1);
                              for (int j = 1; j <= radius-1; j++) {
                                  numbersTarget.remove(i-radius);
                                  numbersTarget.remove(i -radius);

                              }
                          } else {
                              isInvalid=true;

                          }
                      }
                  }

              } else {
                  isInvalid = true;
              }

              if (isInvalid) {
                  System.out.println("Strike missed!");
              }


            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < numbersTarget.size(); i++) {
            int num = numbersTarget.get(i);
            if (i == numbersTarget.size()-1) {
                System.out.print(num);
            } else {
                System.out.print(num + "|");
            }
        }



        
    }
}
