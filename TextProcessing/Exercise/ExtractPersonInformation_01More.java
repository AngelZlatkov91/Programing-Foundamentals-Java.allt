package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractPersonInformation_01More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=nLine ; i++) {
            String text = scanner.nextLine();
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            for (int j = 0; j < text.length(); j++) {
                char symbol = text.charAt(j);
                if (symbol == '@') {
                    for (int k = j+1; k <text.length() ; k++) {
                        char nameSymbol = text.charAt(k);
                        if (nameSymbol == '|'){
                            break;
                        } else {
                            name.append(nameSymbol);
                        }
                    }

                } else if (symbol == '#') {
                    for (int k = j+1; k <text.length() ; k++) {
                        char ageSymbol = text.charAt(k);
                        if (ageSymbol == '*'){
                            break;
                        } else {
                            age.append(ageSymbol);
                        }
                    }

                }
            }
            System.out.println(name + " is " + age + " years old.");

        }

    }
}
