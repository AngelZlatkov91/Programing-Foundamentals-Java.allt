package AssociativeArraysMap.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ranking_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String>  dataContest = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String passwordForContest = input.split(":")[1];
            dataContest.put(contest,passwordForContest);
            input = scanner.nextLine();
        }

         Map<String, Map<String, Integer>> submissions = new LinkedHashMap<>();
        Map<String,Integer> bestCandidate = new LinkedHashMap<>();
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of submissions")) {
            String contest = secondInput.split("=>")[0];
            String password = secondInput.split("=>")[1];
            String userName = secondInput.split("=>")[2];
            int points =Integer.parseInt(secondInput.split("=>")[3]);
            if (dataContest.containsKey(contest)) {
                if (dataContest.get(contest).equals(password)) {
                    if (!submissions.containsKey(userName)) {
                        submissions.put(userName, new LinkedHashMap<>());
                        bestCandidate.put(userName,0);
                    }
                    int currentPoin = bestCandidate.get(userName);
                    bestCandidate.put(userName, currentPoin + points);
                    submissions.get(userName).put(contest,points);
                }
            }
            secondInput = scanner.nextLine();
        }
        String bestName = "";
        int maxPoint = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : bestCandidate.entrySet()) {
            String name = entry.getKey();
            int point = entry.getValue();
            if (point > maxPoint) {
                bestName = name;
                maxPoint = point;
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n",bestName,maxPoint);
        System.out.println("Ranking:");
        for (Map.Entry<String, Map<String, Integer>> entry : submissions.entrySet()) {
            System.out.println(entry.getKey());
            for (Map.Entry<String, Integer> entryValue : entry.getValue().entrySet()) {
                System.out.println("# " + entryValue.getKey() + " -> " + entryValue.getValue());
            }

        }


    }
}
