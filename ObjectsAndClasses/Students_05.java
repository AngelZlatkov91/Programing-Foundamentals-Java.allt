package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    public static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName,String lastName,String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getAge() {
            return age;
        }
    }









    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();



        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] studentsData = input.split(" ");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            String age = studentsData[2];
            String town = studentsData[3];

           Student currentStudent = new Student(firstName,lastName,age,town);
           studentList.add(currentStudent);
            input = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getTown().equals(town)) {
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }

    }
}
