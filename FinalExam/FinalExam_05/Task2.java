package FinalExam.FinalExam_05;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<digit>\\d)";
        Pattern patternCool = Pattern.compile(regex);
        Matcher matcherCool = patternCool.matcher(text);
        int coolThreshold = 1;
        while (matcherCool.find()) {
            int digit = Integer.parseInt(matcherCool.group("digit"));
            coolThreshold *= digit;
        }
        System.out.println("Cool threshold: " + coolThreshold);
        String regexEmoji = "(?<surended>[:\\*]{2})(?<emoji>[A-Z][a-z]{1,}[a-z])\\1";
        Pattern pattern = Pattern.compile(regexEmoji);
        Matcher matcher = pattern.matcher(text);
        List<String> coolEmoji = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            count++;
            int coolestSum = 0;
            String surenGroup = matcher.group("surended");
            String emoji = matcher.group("emoji");
            for (int i = 0; i < emoji.length(); i++) {
                coolestSum += emoji.charAt(i);
            }
            String textEmoji = "";
            if (coolestSum >= coolThreshold) {
                textEmoji = surenGroup + emoji + surenGroup;
                coolEmoji.add(textEmoji);
            }
        }
        System.out.println(count + " emojis found in the text. The cool ones are:");
        coolEmoji.forEach(System.out::println);
    }
}
