package ObjectsAndClasses.Exercise.OpinionPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOpinionPol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
         String [] data = scanner.nextLine().split(" ");
         String name = data[0];
         int age = Integer.parseInt(data[1]);
         if (age > 30) {
             Person person = new Person(name,age);
             people.add(person);
         }

        }
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
