package ArraysListBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProduct_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLineProduct = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 1; i <=nLineProduct ; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }

        Collections.sort(productList);
        for (int i = 0; i < productList.size(); i++) {
            String product = productList.get(i);
            System.out.printf("%d.%s%n",i+1,product);
        }


    }
}
