package FinalExam.FinalExam_03;

import java.util.*;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int nLine =Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> allCars = new LinkedHashMap<>();
        for (int i = 1; i <=nLine ; i++) {
            String []carsData = scanner.nextLine().split("\\|");
            String name = carsData[0];
            int mileage = Integer.parseInt(carsData[1]);
            int fuel = Integer.parseInt(carsData[2]);
            List<Integer> mileAndFuel = new ArrayList<>();
            mileAndFuel.add(mileage); // на 0 индекс милите
            mileAndFuel.add(fuel);     // на 1 индекс горивото
            allCars.put(name,mileAndFuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String [] allAction = input.split(" : ");
            if (input.contains("Drive")) {
                String carName = allAction[1];
                int distance = Integer.parseInt(allAction[2]);
                int fuel = Integer.parseInt(allAction[3]);
                int currentFuel = allCars.get(carName).get(1);
                if (fuel > currentFuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int currentDistance = allCars.get(carName).get(0);
                    allCars.get(carName).set(0,currentDistance + distance);
                    allCars.get(carName).set(1,currentFuel - fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",carName,distance,fuel);
                    if (allCars.get(carName).get(0) >=100000) {
                        System.out.println("Time to sell the " + carName + "!");
                        allCars.remove(carName);
                    }
                }

            } else if (input.contains("Refuel")) {
                String carName = allAction[1];
                int fuel = Integer.parseInt(allAction[2]);
                int currentFuel = allCars.get(carName).get(1);
                if (currentFuel + fuel <=75) {
                    allCars.get(carName).set(1,currentFuel + fuel);
                    System.out.println(carName + " refueled with " + fuel + " liters");
                } else {
                    int diff = 75 - currentFuel;
                    allCars.get(carName).set(1,75);
                    System.out.println(carName + " refueled with " + diff + " liters");
                }
            } else if (input.contains("Revert")) {
                String carName = allAction[1];
                int kilometers = Integer.parseInt(allAction[2]);
                int currentDistance = allCars.get(carName).get(0);
                if (currentDistance - kilometers >= 10000) {
                    allCars.get(carName).set(0,currentDistance - kilometers);
                    System.out.println(carName + " mileage decreased by " + kilometers + " kilometers");
                } else {
                    allCars.get(carName).set(0,10000);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : allCars.entrySet()) {
            String car = entry.getKey();
            int distance = entry.getValue().get(0);
            int fuel = entry.getValue().get(1);
            System.out.println(car + " -> Mileage: " + distance + " kms, Fuel in the tank: " + fuel + " lt.");
        }


    }
}
