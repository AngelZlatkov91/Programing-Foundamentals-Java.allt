package FinalExam.FinalExam_05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        long totalDigit = 1;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int currentDigit = Integer.parseInt(symbol + "");
                totalDigit *= currentDigit;
            }
        }
        System.out.println("Cool threshold: " + totalDigit);
        String emojiRegex = "([:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})(\\1)";
        Pattern emoji = Pattern.compile(emojiRegex);
        Matcher emojiFind = emoji.matcher(text);
        List<String> coolEmoji = new ArrayList<>();
        int count = 0;
        while (emojiFind.find()) {
            count++;
            String word = emojiFind.group("name");
            int sum =0;
            for (char symbol: word.toCharArray()) {
                sum += symbol;
            }
            if (sum >= totalDigit) {
                coolEmoji.add(emojiFind.group());
            }
        }

        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (String word : coolEmoji) {
            System.out.println(word);
        }



    }
}
