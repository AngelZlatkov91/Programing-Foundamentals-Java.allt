package ListArray.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePLanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> textPlanning = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] words = input.split(":");

            if (input.contains("Add:")) {
                String addWord = words[1];
                if(!textPlanning.contains(addWord)){ // pravi v celiq spisak proverka dali se sydyrja
                    textPlanning.add(addWord);
                }

            } else if (input.contains("Insert:")) {
                String insertWord = words[1];
                int index = Integer.parseInt(words[2]);
                if (index>=0 &&index<= textPlanning.size()-1){
                    if(textPlanning.contains(insertWord)){
                        break;
                    } else {
                        textPlanning.add(index,insertWord);
                    }
                }

            } else if (input.contains("Remove:")) {
                String removeWord = words[1];
                    textPlanning.remove(removeWord);


            } else if (input.contains("Swap")) {
                String lesonOne = words[1];
                String lesonTwo = words[2];
                   if(textPlanning.contains(lesonOne)) {
                       if(textPlanning.contains(lesonTwo)) {
                           for (int i = 0; i < textPlanning.size(); i++) {
                               String oneLeson = textPlanning.get(i);
                               boolean inCorect = false;
                               for (int j = 0; j < textPlanning.size(); j++) {
                                   String twoLeson = textPlanning.get(j);
                                   if (oneLeson.equals(lesonOne)  && twoLeson.equals(lesonTwo)) {
                                         if (textPlanning.contains(oneLeson+"-Exercise")){
                                             String excercise = textPlanning.get(i+1);
                                             textPlanning.remove(i+1);
                                             textPlanning.set(j, oneLeson);
                                             textPlanning.set(i, twoLeson);
                                             textPlanning.add(j+1,excercise);

                                       } if (textPlanning.contains(twoLeson +"-Exercise")) {
                                           String excercise = textPlanning.get(j+1);
                                           textPlanning.remove(j+1);
                                           textPlanning.set(j, oneLeson);
                                           textPlanning.set(i, twoLeson);
                                           textPlanning.add(i+1,excercise);

                                       } else {
                                           textPlanning.set(j, oneLeson);
                                           textPlanning.set(i, twoLeson);
                                       }
                                       inCorect = true;
                                       break;
                                   }
                               }
                               if (inCorect) {
                                   break;
                               }
                           }
                       }
                   }
            } else if (input.contains("Exercise:")) {
               String exercise = words[1];
                if(textPlanning.contains(exercise+"-Exercise")){
                    break;
                } else if (textPlanning.contains(exercise)) {
                    for (int i = 0; i < textPlanning.size(); i++) {
                        String word = textPlanning.get(i);
                        if (word.equals(exercise)){
                            textPlanning.add(i+1,word+"-Exercise");
                    }

                }

            } else {
                    textPlanning.add(exercise);
                    textPlanning.add(exercise+"-Exercise");
                }


            }


            input = scanner.nextLine();
        }


        for (int i = 0; i < textPlanning.size(); i++) {
            String result = textPlanning.get(i);
            System.out.printf("%d.%s%n",i+1,result);
        }

    }
}
