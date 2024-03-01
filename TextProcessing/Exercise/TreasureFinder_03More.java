package TextProcessing.Exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureFinder_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> keyNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> allKey = new ArrayList<>();


        String input = scanner.nextLine();
        while (!input.equals("find")) {

            keyLenth(keyNumbers, allKey, input);
            StringBuilder decryptMessage = new StringBuilder();
            decrypt(allKey, input, decryptMessage);
            StringBuilder foundChest = new StringBuilder();
            StringBuilder coordinatesFound = new StringBuilder();
            foundChest(decryptMessage, foundChest, coordinatesFound);
            System.out.println("Found "+ foundChest + " at " + coordinatesFound);

            input = scanner.nextLine();
        }

    }

    private static void foundChest(StringBuilder decryptMessage, StringBuilder foundChest, StringBuilder coordinatesFound) {
        for (int i = 0; i < decryptMessage.length(); i++) {
            char symbol = decryptMessage.charAt(i);
            if (symbol == '&') {
                for (int j = i+1; j < decryptMessage.length() ; j++) {
                    char startSymbol = decryptMessage.charAt(j);
                    if (startSymbol == '&') {
                        i = j;
                        break;
                    } else {
                        foundChest.append(startSymbol);
                    }
                }

            } else if (symbol == '<') {
                for (int j = i+1; j < decryptMessage.length(); j++) {
                    char secondSymbol = decryptMessage.charAt(j);
                    if (secondSymbol == '>') {
                        i=j;
                        break;
                    } else {
                        coordinatesFound.append(secondSymbol);
                    }
                }
            }
        }
    }

    private static void decrypt(List<Integer> allKey, String input, StringBuilder decryptMessage) {
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            int key = allKey.get(i);
            char newSymbol = (char) (symbol - key);
            decryptMessage.append(newSymbol);
        }
    }

    private static void keyLenth(List<Integer> keyNumbers, List<Integer> allKey, String input) {
        int textLent = input.length();
        int count = 0;
        for (int i = 0; i < keyNumbers.size() ; i++) {
            int currentNum = keyNumbers.get(i);
            if (i == keyNumbers.size()-1) {
                i=-1;
            }
            allKey.add(currentNum);
            count++;
            if (count == textLent){
                break;
            }
        }
    }
}
