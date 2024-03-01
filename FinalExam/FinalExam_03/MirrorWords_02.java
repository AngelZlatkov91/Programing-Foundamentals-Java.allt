package FinalExam.FinalExam_03;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String text = scanner.nextLine();
     String regex = "([#@]+)(?<word>[A-Za-z]{3,})\\1\\1(?<mirrorWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorWords = new ArrayList<>();
        List<String> mirrorWord = new ArrayList<>();
        int countMatchWord = 0;
        while (matcher.find())  {
            countMatchWord++;
            String word = matcher.group("word");
            String mirror = matcher.group("mirrorWord");
            StringBuilder reverse = new StringBuilder(mirror);
            reverse.reverse();
            String newWord = reverse.toString();
            if (newWord.equals(word)){
                mirrorWords.add(word);
                mirrorWord.add(mirror);
            }
        }
        if (countMatchWord >0 && !mirrorWords.isEmpty()) {
            System.out.println(countMatchWord + " word pairs found!");
            System.out.println("The mirror words are:");
            for (int i =0; i < mirrorWords.size();i++) {
                String word = mirrorWords.get(i);
                String mirrorWor = mirrorWord.get(i);
                if (i == mirrorWords.size()-1) {
                    System.out.print(word + " <=> " + mirrorWor);
                } else {
                    System.out.print(word + " <=> " + mirrorWor + ", ");
                }
            }

        } else if (countMatchWord > 0) {
            System.out.println(countMatchWord + " word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }


    }
}
