package BasycSyntaxConditionalAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double countLightsabers = Math.ceil(countStudents + (countStudents * 0.1));
        int countBeltStudents = 0;
        if (countStudents >= 6) {
           countBeltStudents = countStudents  / 6;
        }
        double allSum = (countLightsabers * priceLightsabers) + (countStudents * priceRobes) + ((countStudents - countBeltStudents) * priceBelts);
        if (amountMoney >= allSum) {
            System.out.printf("The money is enough - it would cost %.2flv.",allSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",allSum - amountMoney);
        }





    }
}
