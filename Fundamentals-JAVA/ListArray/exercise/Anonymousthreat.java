package ListArray.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anonymousthreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > text.size()-1){
                    endIndex = text.size()-1;
                }
                String resultMerge = "";
                if (startIndex>= 0 && startIndex <= text.size() - 1 && endIndex >= 0 && endIndex <= text.size() - 1) {

                    for (int index = startIndex; index <= endIndex; index++) {
                     String current = text.get(index);
                     resultMerge += current;
                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        text.remove(startIndex);
                    }
                    text.add(startIndex,resultMerge);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index<= text.size()-1) {
                    String textForDivide = text.get(index);
                    text.remove(index);
                    int countSymbolsPerPart = textForDivide.length() / partitions;
                    int beginIndex = 0;
                    for (int i = 1; i < partitions ; i++) {
                        String textPerPart = textForDivide.substring(beginIndex,beginIndex + countSymbolsPerPart);
                        text.add(i,textPerPart);
                        index++;
                        beginIndex += countSymbolsPerPart;
                    }
                    String lastPart = textForDivide.substring(beginIndex,textForDivide.length());
                    text.add(index,lastPart);
                }

            }


            command = scanner.nextLine();
        }

        for (String texte : text) {
            System.out.print( texte + " ");
        }

    }
}
