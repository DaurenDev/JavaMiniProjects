package Lab7_Adapter.Part1;

import java.util.ArrayList;

public class SongContainer {
    ArrayList<String> songs = new ArrayList<>();
    public void showAllSongs(){
        songs.add("NEFFEX - Cold");
        songs.add("NEFFEX - Rumors");
        songs.add("NEFFEX - Destiny");
        songs.add("Aurora - Run Away");
        songs.add("Aurora - Murder Song");
        songs.add("Aurora - Forgotten Love");
        songs.add("Eminem - Not Afraid");
        songs.add("Eminem - Love The Way You Lie");
        songs.add("Eminem - Till I Collapse");

        for (String allSongs: songs) {
            System.out.println(allSongs);
        }
    }

    public void download(String song){
        System.out.println(song + " has been added");
        songs.add(song);
    }

    public void delete(String song){
        if(songs.contains(song)){
            songs.remove(song);
        }
    }
}
