package lab.ZADACHIOTIZPIT;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int pricevideoCart = Integer.parseInt(scanner.nextLine());
          int pricepart = Integer.parseInt(scanner.nextLine());
          double elektrik = Double.parseDouble(scanner.nextLine());
          double winingprice = Double.parseDouble(scanner.nextLine());

          int sumvideocart = pricevideoCart * 13;
          int sumParrtt = pricepart * 13;

           int allSum = sumvideocart + sumParrtt + 1000;
           double pricePerCard = winingprice - elektrik;
           double pricePerDAy = 13 * pricePerCard;
           double daysBack = allSum / pricePerDAy;

        System.out.println(allSum);
        System.out.printf("%.0f", Math.ceil(daysBack));
    }
}
