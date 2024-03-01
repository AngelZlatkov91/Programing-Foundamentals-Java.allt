package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] file  = scanner.nextLine().split("\\\\");
        String[] extract = file[file.length-1].split("\\.");
        System.out.println("File name: " + extract[0]);
        System.out.println("File extension: " + extract[1]);



    }
}
