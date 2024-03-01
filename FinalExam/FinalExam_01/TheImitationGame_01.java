package FinalExam.FinalExam_01;
import java.util.Scanner;
public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptText = scanner.nextLine();
        StringBuilder decrypt = new StringBuilder();
        for (int i = 0; i < encryptText.length(); i++) {
            char symbol = encryptText.charAt(i);
            decrypt.append(symbol);
        }

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            if (input.contains("Move")) {
                int count = Integer.parseInt(input.split("\\|")[1]);
                String firstSymbol = decrypt.substring(0,count);
               decrypt.delete(0,count);
               decrypt.append(firstSymbol);

            } else if (input.contains("Insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                String insert = input.split("\\|")[2];
                decrypt.insert(index,insert);


            } else if (input.contains("ChangeAll")) {
                String subString = input.split("\\|")[1];
                String replacement = input.split("\\|")[2];
                int index = decrypt.indexOf(subString);
                while (index != -1) {
                    decrypt.replace(index,index+1,replacement);
                    index = decrypt.indexOf(subString);

                }
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + decrypt);



    }
}
