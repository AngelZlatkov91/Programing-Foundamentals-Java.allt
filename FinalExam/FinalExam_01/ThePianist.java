package FinalExam.FinalExam_01;
import java.util.*;
public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pianistList = new LinkedHashMap<>();
        for (int i = 1; i <=nLine ; i++) {
            String [] pieces = scanner.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];
         List<String> composerAndKey = new ArrayList<>();
         composerAndKey.add(composer);
         composerAndKey.add(key);
         pianistList.put(piece,composerAndKey);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
           if (input.contains("Add")) {
               String piece = input.split("\\|")[1];
               String composer = input.split("\\|")[2];
               String key = input.split("\\|")[3];
               if (!pianistList.containsKey(piece)){
                   List<String> add = new ArrayList<>();
                   add.add(composer);
                   add.add(key);
                   pianistList.put(piece,add);
                   System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
               } else {
                   System.out.printf("%s is already in the collection!%n",piece);
               }
           } else if (input.contains("Remove")) {
               String piece = input.split("\\|")[1];
               if (pianistList.containsKey(piece)) {
                   pianistList.remove(piece);
                   System.out.printf("Successfully removed %s!%n",piece);
               } else {
                   System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
               }
           } else if (input.contains("ChangeKey")) {
               String piece = input.split("\\|")[1];
               String newKey = input.split("\\|")[2];
               if (!pianistList.containsKey(piece)) {
                   System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
               } else {
                   pianistList.get(piece).set(1,newKey);
                   System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
               }
           }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pianistList.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue().get(0);
            String key = entry.getValue().get(1);
            System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);
        }


    }
}
