package Player;

import java.io.*;
import java.util.StringTokenizer;

public class MusicCompositions {
    protected Song[] store;
    protected int countSongs;
    protected int position = 0;

    MusicCompositions(int count) {
        countSongs = count;
        store = new Song[countSongs];
    }

    MusicCompositions(String path) throws FileNotFoundException, IOException {
        StringTokenizer st;
        String strTemp = " ";
        File temp = new File(path);
        BufferedReader bf = new BufferedReader(new FileReader(temp));
        while (strTemp != null) {
            st = new StringTokenizer(strTemp = bf.readLine(), ":");
            while (st.hasMoreTokens()) {
                store[position] = new Song(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
            }
            position++;
            countSongs = position;
        }
    }

    public void addSong(String performer, String songTitle, String ganre, int duration) {
        store[position] = new Song(performer, songTitle, ganre, duration);
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
        String ganre;
        int duration;

        Song(String performer, String songTitle, String ganre, int duration) {
            this.performer = performer;
            this.songTitle = songTitle;
            this.ganre = ganre;
            this.duration = duration;
        }

        public String toString() {
            return performer + " " + songTitle + " " + ganre + " " + duration;
        }
    }
}

