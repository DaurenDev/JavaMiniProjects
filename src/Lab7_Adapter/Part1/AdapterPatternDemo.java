package Lab7_Adapter.Part1;

import Lab7_Adapter.Part1.MediaPlayer.AudioPlayer;

import java.util.ArrayList;

public class AdapterPatternDemo {
    public static void main(String[] args) {

//        SongContainer songContainer = new SongContainer();
//        songContainer.showAllSongs();
//        songContainer.delete("Rumors");
//        System.out.println();
//        System.out.println();
//        songContainer.showAllSongs();

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP4", "NEFFEX - Cold");
        audioPlayer.play("MP3", "NEFFEX - Rumors");
        audioPlayer.play("VLC", "Eminem - 'Till I Collapse");
        audioPlayer.play("mpg-4", "Destiny");
    }


}
