package FundamentalsFinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MessageDecrypt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int nLines = Integer.parseInt(scanner.nextLine());
         String regex = "\\B(?<surended>[$%])(?<mesage>[A-Z][a-z]{2,})\\1: \\[(?<firstChar>[0-9]+)\\]\\|\\[(?<secondChar>[0-9]+)\\]\\|\\[(?<thirdChar>[0-9]+)\\]\\|\\B";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < nLines; i++) {
            String input = scanner.nextLine();
            String digit = input.split("\\: ")[1];
           if (digit.length()-1 <=17) {
               Matcher matcher = pattern.matcher(input);
               if (matcher.find()) {
                   String text = "";
                   String message = matcher.group("mesage");
                   int firstChar = Integer.parseInt(matcher.group("firstChar"));
                   int second = Integer.parseInt(matcher.group("secondChar"));
                   int third = Integer.parseInt(matcher.group("thirdChar"));
                   char firstSymbol = (char) firstChar;
                   char secondSymbol = (char) second;
                   char thirdSymbol = (char) third;
                   System.out.println(message + ": " + firstSymbol + "" + secondSymbol + "" + thirdSymbol);

               } else {
                   System.out.println("Valid message not found!");
               }
           } else {
               System.out.println("Valid message not found!");
           }
        }
    }
}
