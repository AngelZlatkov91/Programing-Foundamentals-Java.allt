package RegularExpressions.Exercise;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PostOffice_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        List<Character> symbols = new ArrayList<>();
        findUpperLetter(text, symbols);
        Map<Character,Integer> codeAndLength = new LinkedHashMap<>();
        asciiAndLength(text, codeAndLength);
         List<String> allWords = new ArrayList<>();
        String []thirdPart = text.get(2).split("\\s+");
        for (String word : thirdPart) {
            char firstSymbol = word.charAt(0);
            if (symbols.contains(firstSymbol)) {
               int currentLength = codeAndLength.get(firstSymbol);
               if (word.length() == currentLength+1){
                   allWords.add(word);
               }
            }
        }
        allWords.forEach(System.out::println);

    }

    private static void asciiAndLength(List<String> text, Map<Character, Integer> codeAndLength) {
        String secondPart = text.get(1);
        String secondRegex ="(?<asciiCode>[0-9]{2}):(?<length>[0-9]{2})";
        Pattern asciiAndLength = Pattern.compile(secondRegex);
        Matcher matcher = asciiAndLength.matcher(secondPart);
        while (matcher.find()) {
            int asciiCode = Integer.parseInt(matcher.group("asciiCode"));
            int length = Integer.parseInt(matcher.group("length"));
            codeAndLength.put((char) asciiCode,length);
        }
    }

    private static void findUpperLetter(List<String> text, List<Character> symbols) {
        String firstPart = text.get(0);
        String firstRegex ="([#$%\\&\\*]{1})(?<capitalLetter>[A-Z]+)\\1";
        Pattern upperCase = Pattern.compile(firstRegex);
        Matcher matcherUpper = upperCase.matcher(firstPart);
        while (matcherUpper.find()) {
            String word = matcherUpper.group("capitalLetter");
            for (char symbol : word.toCharArray()) {
                symbols.add(symbol);
            }
        }
    }
}
