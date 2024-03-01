package FinalExam.FinalExam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
         String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < nLine; i++) {
            String barcode = scanner.nextLine();
            StringBuilder group = new StringBuilder();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String match = matcher.group("barcode");
                for (int j = 0; j < match.length(); j++) {
                    char symbol = match.charAt(j);
                    if (Character.isDigit(symbol)){
                        group.append(symbol);
                    }
                }
                if (group.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + group);
                }

            } else {
                System.out.println("Invalid barcode");
            }


        }



    }
}
