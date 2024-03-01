package FinalExam.FinalExam_04;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());
           String regex = "(?<surrounded>@)(?<followed>#+)(?<name>[A-Z][A-Za-z0-9]+[A-Za-z0-9]*[A-Z])\\1#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <=nLines ; i++) {
            String barcode = scanner.nextLine();
          Matcher matcher = pattern.matcher(barcode);
          if (matcher.find()){
              String word = matcher.group("name");
              if (word.length() >=6) {
                  StringBuilder digit = new StringBuilder();
                  for (int j = 0; j < word.length(); j++) {
                      char symbol = word.charAt(j);
                      if (Character.isDigit(symbol)) {
                          digit.append(symbol);
                      }
                  }
                  if (digit.length() - 1 < 0) {
                      System.out.println("Product group: 00");
                  } else {
                      System.out.println("Product group: " + digit);
                  }
              } else {
                  System.out.println("Invalid barcode");
              }
          } else {
              System.out.println("Invalid barcode");
          }
        }
    }
}
