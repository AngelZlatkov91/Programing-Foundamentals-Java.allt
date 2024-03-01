package TextProcessing.Exercise;
import java.util.Scanner;

public class MorseCodeTranslator_04More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        StringBuilder translateText = new StringBuilder();
        for (String morsCode : text) {
            if (morsCode.equals("|")) {
                translateText.append(" ");
            } else if (morsCode.equals(".-")) {
                translateText.append("A");
            }else if (morsCode.equals("-...")) {
                translateText.append("B");
            }else if (morsCode.equals("-.-.")) {
                translateText.append("C");
            }else if (morsCode.equals("-..")) {
                translateText.append("D");
            }else if (morsCode.equals(".")) {
                translateText.append("E");
            }else if (morsCode.equals("..-.")) {
                translateText.append("F");
            }else if (morsCode.equals("--.")) {
                translateText.append("G");
            }else if (morsCode.equals("....")) {
                translateText.append("H");
            }else if (morsCode.equals("..")) {
                translateText.append("I");
            }else if (morsCode.equals(".---")) {
                translateText.append("J");
            }else if (morsCode.equals("-.-")) {
                translateText.append("K");
            }else if (morsCode.equals(".-..")) {
                translateText.append("L");
            }else if (morsCode.equals("--")) {
                translateText.append("M");
            }else if (morsCode.equals("-.")) {
                translateText.append("N");
            }else if (morsCode.equals("---")) {
                translateText.append("O");
            }else if (morsCode.equals(".--.")) {
                translateText.append("P");
            }else if (morsCode.equals("--.-")) {
                translateText.append("Q");
            }else if (morsCode.equals(".-.")) {
                translateText.append("R");
            }else if (morsCode.equals("...")) {
                translateText.append("S");
            }else if (morsCode.equals("-")) {
                translateText.append("T");
            }else if (morsCode.equals("..-")) {
                translateText.append("U");
            }else if (morsCode.equals("...-")) {
                translateText.append("V");
            }else if (morsCode.equals(".--")) {
                translateText.append("W");
            }else if (morsCode.equals("-..-")) {
                translateText.append("X");
            }else if (morsCode.equals("-.--")) {
                translateText.append("Y");
            }else if (morsCode.equals("--..")) {
                translateText.append("Z");
            }
        }
        System.out.println(translateText);





    }
}
