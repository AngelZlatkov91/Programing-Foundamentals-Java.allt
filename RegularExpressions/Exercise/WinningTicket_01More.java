package RegularExpressions.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allTicket = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
         String regex = "(?<left>[@#$^]{6,})\\w*(?<right>\\1)";
        Pattern pattern = Pattern.compile(regex);
        for (String ticket : allTicket) {
            ticket = ticket.trim();
            if (ticket.length() == 20) {
                Matcher matcher = pattern.matcher(ticket);
                if (matcher.find()) {
                    String left = matcher.group("left");
                    String right = matcher.group("right");
                    int count = 0;
                    if (left.equals(right)) {
                        for (int i = 0; i < left.length() - 1; i++) {
                            char first = left.charAt(i);
                            char second = left.charAt(i + 1);
                            if (first != second) {
                                count++;
                            }
                        }
                        if (count > 0) {
                            System.out.println("ticket \"" + ticket + "\" - no match");
                        } else {
                            if (left.length() == 10) {
                                System.out.println("ticket \"" + ticket + "\" - " + left.length() + "" + left.charAt(0) + " Jackpot!");
                            } else {
                                System.out.println("ticket \"" + ticket + "\" - " + left.length() + left.charAt(0));
                            }
                        }

                    } else {
                        System.out.println("ticket \"" + ticket + "\" - no match");
                    }


                } else {
                    System.out.println("ticket \"" + ticket + "\" - no match");
                }
            }else {
                System.out.println("invalid ticket");
            }
        }
    }
}
