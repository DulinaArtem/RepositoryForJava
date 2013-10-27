package Player;


public class MainControl {
    public static void main(String [] args) {
        MusicCompositions comp = new MusicCompositions(100);
        comp.addSong("God", "Dance", 100);
        comp.addSong("God2", "Dance", 100);
        System.out.println(comp);
    }
}
