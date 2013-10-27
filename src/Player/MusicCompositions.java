package Player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MusicCompositions {
    protected Song[] store;
    protected int countSongs;
    protected int position = 0;

    MusicCompositions(int count) {
        countSongs = count;
        store = new Song[countSongs];
    }

    MusicCompositions(String path, int count) throws IOException {
        store = new Song[count];
        StringTokenizer st;
        String strTemp;
        File temp = new File(path);
        BufferedReader bf = new BufferedReader(new FileReader(temp));
        while ((strTemp = bf.readLine()) != null) {
            st = new StringTokenizer(strTemp, ":");
            while (st.hasMoreTokens()) {
                store[position] = new Song(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
            }
            position++;
            countSongs = position;
        }
    }

    public void addSong(String performer, String songTitle, String genre, int duration) {
        store[position] = new Song(performer, songTitle, genre, duration);
        position++;
        countSongs = position;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < countSongs; i++)
            temp += store[i] + "\n";
        return temp;
    }

    private class Song {
        String performer;
        String songTitle;
        String genre;
        int min = 0;
        int seconds = 0;
        int duration;

        Song(String performer, String songTitle, String genre, int duration) {
            this.performer = performer;
            this.songTitle = songTitle;
            this.genre = genre;
            if (duration / 60 != 0) {
                this.min = duration / 60;
                this.seconds = duration % 60;
            } else
                this.seconds = duration;
        }

        public String toString() {
            return "Исполнитель: " + performer + " " + "Название песни: " + songTitle + " " +
                    "Жанр: " + genre + " " + "Длительность: " + min + ":" + seconds;
        }
    }
}

