package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public  static class Song {
        String typeList;
        String name ;

        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String[] songsArr = text.split("_");
            String typeList = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];
         Song currentSong = new Song(typeList, name, time);
         songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song : songList) {
                System.out.println(song.getName());
            }
            System.out.println();
        } else {
            for (Song song : songList) {
                String currentType = song.getTypeList();
                if (currentType.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }

    }



}
