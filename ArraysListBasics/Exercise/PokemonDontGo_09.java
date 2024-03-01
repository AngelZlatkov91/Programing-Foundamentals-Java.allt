package ArraysListBasics.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersPower = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while ((numbersPower.size() > 0)) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n >= 0 && n <= numbersPower.size() - 1) {
                int numremove = numbersPower.get(n);
                numbersPower.remove(n);
                sum +=numremove;
                for (int i = 0; i < numbersPower.size(); i++) {
                    int curentNum = numbersPower.get(i);
                    if (curentNum <= numremove) {
                        numbersPower.remove(i);
                        numbersPower.add(i, curentNum + numremove);
                    } else {
                        numbersPower.remove(i);
                        numbersPower.add(i, Math.abs(numremove - curentNum));
                    }
                }
            } else if (n < 0 ) {
                int lastNum = numbersPower.get(numbersPower.size()-1);
                int removeNum = numbersPower.get(0);
                sum +=removeNum;
                numbersPower.remove(0);
                numbersPower.add(0,lastNum);
                for (int i = 0; i < numbersPower.size(); i++) {
                    int currentNum = numbersPower.get(i);
                    if (currentNum <=removeNum){
                        currentNum += removeNum;
                    } else {
                        currentNum -= removeNum;
                    }
                    numbersPower.set(i,currentNum);
                }

            }
            else {
                int firsNum = numbersPower.get(0);
                int removeNum = numbersPower.get(numbersPower.size()-1);
                sum+=removeNum;
                numbersPower.remove(numbersPower.size()-1);
                numbersPower.add(firsNum);
                for (int i = 0; i < numbersPower.size(); i++) {
                    int currentNum = numbersPower.get(i);
                    if (currentNum <=removeNum){
                        currentNum += removeNum;
                    } else {
                        currentNum -= removeNum;
                    }
                    numbersPower.set(i,currentNum);

                }
            }

        }
        System.out.println(sum);

    }
}
