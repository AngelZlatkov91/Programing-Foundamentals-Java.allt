package FinalExam.FinalExam_03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<surended>[@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> word = new ArrayList<>();
        List<String> mirrorWord = new ArrayList<>();
        int count = 0;
        while (matcher.find()){
            count++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder rever = new StringBuilder(secondWord);
            rever.reverse();
            String reverse = rever.toString();
            if (reverse.equals(firstWord)) {
                word.add(firstWord);
                mirrorWord.add(secondWord);

            }
        }
        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(count + " word pairs found!");
        }
        if (word.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < word.size(); i++) {
                String first = word.get(i);
                String second = mirrorWord.get(i);
                if (i == word.size()-1) {
                    System.out.print(first + " <=> " + second);
                } else {
                    System.out.print(first + " <=> " + second + ", ");
                }

            }

        }



    }
}
