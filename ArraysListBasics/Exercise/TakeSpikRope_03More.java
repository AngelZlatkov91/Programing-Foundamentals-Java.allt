package ArraysListBasics.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSpikRope_03More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Character> allSymbols = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
              int digit = Character.getNumericValue(symbol);
                numberList.add(digit);
            } else {
                allSymbols.add(symbol);
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 1; i <= numberList.size(); i++) {
            if (i % 2 == 0) {
                skipList.add(numberList.get(i-1));
            } else {
                takeList.add(numberList.get(i-1));
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < takeList.size(); i++) {
            int takeDigit = takeList.get(i);
            int skipDigit = skipList.get(i);
            if (takeDigit !=0) {
                for (int j = 0; j <takeDigit ; j++) {
                    char symbol = allSymbols.get(0);
                    result.append(symbol);
                    allSymbols.remove(0);
                    if (allSymbols.isEmpty()) {
                        break;
                    }
                }
            }
            if (skipDigit != 0) {
                for (int j = 0; j <skipDigit ; j++) {
                    if (allSymbols.isEmpty()){
                        break;
                    }
                    allSymbols.remove(0);

                }
            }

        }
        System.out.println(result);




    }
}
