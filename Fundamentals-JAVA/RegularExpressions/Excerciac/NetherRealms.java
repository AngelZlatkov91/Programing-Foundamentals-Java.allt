package RegularExpressions.Excerciac;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> demonName = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());
        // String[] demonName = scanner.nextLine().split(",\\s+"); pyrvi primer s greshka
        String regexHealth = "[^0-9+*-\\/.]";
        Pattern patternHealth = Pattern.compile(regexHealth);
        String regexDamage = "\\+?\\-?\\d+\\.?\\d*";
        Pattern patternDamage = Pattern.compile(regexDamage);

        for (String demon : demonName) {
            Matcher matcherHealth = patternHealth.matcher(demon);
            int health = 0;
            while (matcherHealth.find()) {
                char symbol = matcherHealth.group().charAt(0);
                health += symbol;
            }
            Matcher matcherDamage = patternDamage.matcher(demon);
            double damage = 0;
            while (matcherDamage.find()) {
                double currentDamage = Double.parseDouble(matcherDamage.group());
                damage += currentDamage;

            }
            for (Character symbol : demon.toCharArray()) {
                if ( symbol == '/') {
                    damage /=2;
                } else if (symbol == '*') {
                    damage *=2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);



        }








    }
}
