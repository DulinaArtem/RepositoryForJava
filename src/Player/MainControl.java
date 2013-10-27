package Player;

import java.io.IOException;

public class MainControl {
    public static void main(String[] args) throws IOException {
        MusicCompositions comp = new MusicCompositions("songs.txt", 100);
        System.out.println(comp);
    }
}
