package FinalExam.FinalExam_02;
import java.util.Scanner;
public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stopsCity = scanner.nextLine();
        StringBuilder allStops = new StringBuilder(stopsCity);
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            if (input.contains("Add")) {
                int index = Integer.parseInt(input.split(":")[1]);
                String addStop = input.split(":")[2];
                if (index >=0 && index <= allStops.length()-1) {
                    allStops.insert(index,addStop);
                }
                System.out.println(allStops);
            } else if (input.contains("Remove")) {
                int startIndex = Integer.parseInt(input.split(":")[1]);
                int endIndex = Integer.parseInt(input.split(":")[2]);
                if (startIndex>=0 && startIndex<=allStops.length()-1 && endIndex >=0 && endIndex <= allStops.length()-1) {
                    String toString = allStops.toString();
                    String replace = allStops.substring(startIndex,endIndex);
                     toString = toString.replace(replace,"");
                     allStops = new StringBuilder(toString);
                }
                System.out.println(allStops);
            } else if (input.contains("Switch")) {
                String oldString = input.split(":")[1];
                String newString = input.split(":")[2];
                String toString = allStops.toString();

                System.out.println(allStops);
            }
            input = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStops);

    }
}
