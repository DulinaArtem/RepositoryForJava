package Player;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainControl {
    public static void main(String [] args) throws IOException {
        MusicCompositions comp = new MusicCompositions("songs.txt",100);
        System.out.println(comp);
    }
}
