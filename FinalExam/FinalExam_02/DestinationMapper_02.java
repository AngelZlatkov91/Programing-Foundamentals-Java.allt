package FinalExam.FinalExam_02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        String regex = "([=]|[\\/]{1})(?<city>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);
        int travelPoint =0;
        List<String> destination = new ArrayList<>();
        while (matcher.find()) {
            String city = matcher.group("city");
            destination.add(city);
            travelPoint += city.length();
        }
        System.out.print("Destinations: ");
        for (int i = 0; i < destination.size(); i++) {
            String city = destination.get(i);
            if (i == destination.size()-1) {
                System.out.print(city);
            } else {
                System.out.print(city + ", ");
            }
        }
        System.out.println();
        System.out.println("Travel Points: " + travelPoint);
    }
}
