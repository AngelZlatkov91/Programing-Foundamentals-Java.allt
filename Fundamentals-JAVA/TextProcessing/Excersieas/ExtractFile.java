package TextProcessing.Excersieas;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] filetext = scanner.nextLine().split("\\\\");
        String [] text = filetext[filetext.length-1].split("\\.");
        String fileName = text[0];
        String fileExtension = text[1];
        System.out.println("File name: " + fileName );
        System.out.println("File extension: " + fileExtension );




    }
}
