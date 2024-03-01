package ArraysListBasics.Exercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> currentCourse = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            if (command.equals("Add")) {
                String lessonTitle = input.split(":")[1];
                if (!currentCourse.contains(lessonTitle)) {
                    currentCourse.add(lessonTitle);
                }
            } else if (command.equals("Insert")) {
                String lessonTitle = input.split(":")[1];
                int index = Integer.parseInt(input.split(":")[2]);
                if (!currentCourse.contains(lessonTitle)) {
                    currentCourse.add(index,lessonTitle);
                }
            } else if (command.equals("Remove")) {
                String lessonTitle = input.split(":")[1];
                currentCourse.remove(lessonTitle);
                currentCourse.remove(lessonTitle + "-Exercise");
            } else if (command.equals("Swap")) {
                String firstLesson = input.split(":")[1];
                String secondLesson = input.split(":")[2];
                if (currentCourse.contains(firstLesson) && currentCourse.contains(secondLesson)) {
                    int indexOne = currentCourse.indexOf(firstLesson);
                    int indexTwo = currentCourse.indexOf(secondLesson);
                    currentCourse.set(indexOne,secondLesson);
                    currentCourse.set(indexTwo,firstLesson);
                    if (currentCourse.contains(firstLesson +"-Exercise")) {
                        int indexOneExercise = currentCourse.indexOf(firstLesson +"-Exercise");
                       String exercise = firstLesson + "-Exercise";
                       int indexFirstLesson = currentCourse.indexOf(firstLesson);
                       currentCourse.remove(indexOneExercise);
                       currentCourse.add(indexFirstLesson+1,exercise);
                    }
                    if (currentCourse.contains(secondLesson +"-Exercise")) {
                        int indexOneExercise = currentCourse.indexOf(secondLesson +"-Exercise");
                        String exercise = secondLesson + "-Exercise";
                        int indexSecondLesson = currentCourse.indexOf(secondLesson);
                        currentCourse.remove(indexOneExercise);
                        currentCourse.add(indexSecondLesson+1,exercise);
                    }
                }
            } else if (command.equals("Exercise")) {
                String lessonTitle = input.split(":")[1];
                if (currentCourse.contains(lessonTitle + "-Exercise")) {
                    break;
                }
                else if (!currentCourse.contains(lessonTitle)){
                    currentCourse.add(lessonTitle);
                    currentCourse.add(lessonTitle+"-Exercise");
                } else {
                    int index = currentCourse.indexOf(lessonTitle);
                    currentCourse.add(index+1,lessonTitle+"-Exercise");
                }

            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < currentCourse.size(); i++) {
            String lesson = currentCourse.get(i);
            System.out.printf("%d.%s%n",i+1,lesson);

        }

    }
}
