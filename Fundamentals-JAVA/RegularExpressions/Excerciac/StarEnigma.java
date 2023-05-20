package RegularExpressions.Excerciac;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLIne = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<namePLanet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<AttacType>[AD])![^@!:>-]*->(?<soldielCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> atackPlanets = new ArrayList<>();
        List<String> destroyPlanet = new ArrayList<>();




        for (int i = 1; i <=nLIne ; i++) {
            String encryptText = scanner.nextLine();
            StringBuilder decryptText = getDecryptText(i, encryptText);
            String textDecrypt = decryptText.toString();
            Matcher matcher = pattern.matcher(textDecrypt);
           if (matcher.find()) {
               String planetName = matcher.group("namePLanet");
               String attacType = matcher.group("AttacType");
               if (attacType.equals("A")) {
                   atackPlanets.add(planetName);
               } else if (attacType.equals("D")) {
                   destroyPlanet.add(planetName);
               }

           }

        }
        System.out.println("Attacked planets: " + atackPlanets.size());
        Collections.sort(atackPlanets);
        atackPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyPlanet.size());
        Collections.sort(destroyPlanet);
        destroyPlanet.forEach(planet -> System.out.println("-> " + planet));

    }

    private static StringBuilder getDecryptText(int i, String encryptText) {
        int count = 0;
        for (char symbol : encryptText.toCharArray()) {
            switch (symbol){
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        StringBuilder decryptText = new StringBuilder();
        for (char symbol : encryptText.toCharArray()) {
            char newSymbol = (char) (symbol - count);
            decryptText.append(newSymbol);
        }
        return decryptText;
    }

}
