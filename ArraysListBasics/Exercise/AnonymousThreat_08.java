package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> textArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            if (input.contains("merge")) {
                int startIndex = Integer.parseInt(input.split(" ")[1]);
                int endIndex = Integer.parseInt(input.split(" ")[2]);
                if (startIndex < 0 ) {
                    startIndex = 0;
                }
                if (endIndex > textArray.size()-1) {
                    endIndex = textArray.size()-1;
                }
                String mergeText = "";
                if (startIndex >= 0 && startIndex <= textArray.size() - 1 && endIndex >= 0 && endIndex <= textArray.size() - 1) {
                    
                    for (int i = startIndex; i <=endIndex ; i++) {
                       String text = textArray.get(i);
                       mergeText += text;
                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        textArray.remove(startIndex);
                    }

                }
                textArray.add(startIndex,mergeText);

            } else if (input.contains("divide")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int partition = Integer.parseInt(input.split("\\s+")[2]);
                if (index >= 0 && index <= textArray.size() - 1) {
                    //{"abcdef", "ghi", "jkl"}
                    //divide 0 3
                    String textForDivide = textArray.get(index); //"abcdef"
                    textArray.remove(index);
                    //{"ghi", "jkl"}

                    //1. колко символа ще има всяка част
                    int countSymbolsPerPart = textForDivide.length() / partition;

                    //всички равни части без последната
                    int beginIndex = 0; //index в текста за деление
                    for (int part = 1; part < partition; part++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        textArray.add(index, textPerPart);
                        index++; //място на поставяне на разбитата част в главния списък
                        beginIndex += countSymbolsPerPart;
                    }

                    //последната част
                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    textArray.add(index, textLastParts);
                }

            }
                



            input = scanner.nextLine();
        }

        System.out.println(String.join(" ",textArray));







    }
}
