package Player;


public class Player {
    protected int storeDuration [];    //Храним длительность песни
    Player(MusicCompositions musComp) {
        storeDuration = new int[musComp.countSongs];
        for (int i = 0 ; i < musComp.countSongs;i++)
            storeDuration[i] = musComp.store[i].duration;
    }
    public void playSong(int index) //номер трека
    {

    }
    public void stop()
    {

    }
    public void resume()
    {

    }
}
