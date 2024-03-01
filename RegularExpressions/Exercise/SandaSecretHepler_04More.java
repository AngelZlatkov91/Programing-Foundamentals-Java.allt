package RegularExpressions.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SandaSecretHepler_04More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kye = Integer.parseInt(scanner.nextLine());

        List<String> goodChild = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String newTex = "";
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                newTex += (char) (symbol - kye);
            }

            String nameRegex = "@(?<name>[A-Za-z]+)\\W*\\w*([@\\-!:>])(?<behavior>[G|N])\\2";
            Pattern namePattern = Pattern.compile(nameRegex);

          Matcher matcherName = namePattern.matcher(newTex);
          if (matcherName.find()) {
              String name = matcherName.group("name");
              String behaviorTest = matcherName.group("behavior");
              if (behaviorTest.equals("G")) {
                  goodChild.add(name);
              }
          }
            input = scanner.nextLine();
        }

       goodChild.forEach(System.out::println);

    }
}
