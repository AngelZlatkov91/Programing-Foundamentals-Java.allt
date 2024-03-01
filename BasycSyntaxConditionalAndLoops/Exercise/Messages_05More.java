package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class Messages_05More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTyping = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        for (int i = 1; i <=countTyping ; i++) {
            int digitTyping = Integer.parseInt(scanner.nextLine());
            switch (digitTyping) {
                case 2:
                    text.append("a");
                    break;
                case 22:
                    text.append("b");
                    break;
                case 222:
                    text.append("c");
                    break;
                case 3:
                    text.append("d");
                    break;
                case 33:
                    text.append("e");
                    break;
                case 333:
                    text.append("f");
                    break;
                case 4:
                    text.append("g");
                    break;
                case 44:
                    text.append("h");
                    break;
                case 444:
                    text.append("i");
                    break;
                case 5:
                    text.append("j");
                    break;
                case 55:
                    text.append("k");
                    break;
                case 555:
                    text.append("l");
                    break;
                case 6:
                    text.append("m");
                    break;
                case 66:
                    text.append("n");
                    break;
                case 666:
                    text.append("o");
                    break;
                case 7:
                    text.append("p");
                    break;
                case 77:
                    text.append("q");
                    break;
                case 777:
                    text.append("r");
                    break;
                case 7777:
                    text.append("s");
                    break;
                case 8:
                    text.append("t");
                    break;
                case 88:
                    text.append("u");
                    break;
                case 888:
                    text.append("v");
                    break;
                case 9:
                    text.append("w");
                    break;
                case 99:
                    text.append("x");
                    break;
                case 999:
                    text.append("y");
                    break;
                case 9999:
                    text.append("z");
                    break;
                case 0:
                    text.append(" ");
                    break;
            }
        }
        System.out.println(text);
    }
}
