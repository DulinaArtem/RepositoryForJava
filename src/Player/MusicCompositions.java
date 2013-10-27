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

    MusicCompositions(String path) throws FileNotFoundException {
        StringTokenizer st = new StringTokenizer();
        File temp = new File(path);
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(temp)));
        while(bf.readLine())
    }

    public void addSong(String songTitle, String ganre, int duration) {
        store[position] = new Song(songTitle, ganre, duration);
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
        String songTitle;
        String ganre;
        int duration;

        Song(String songTitle, String ganre, int duration) {
            this.songTitle = songTitle;
            this.ganre = ganre;
            this.duration = duration;
        }

        public String toString() {
            return songTitle + " " + ganre + " " + duration;
        }
    }
}

